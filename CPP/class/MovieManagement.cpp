#include <iostream>
#include <string>
#include <fstream>
#include <ctime>
#include <conio.h>
using namespace std;

void displayMovies(int d);  // Prototyping

//---------------------MovieFunction Block---------------------------------//
struct Movieddl
{
	string Movie_Name, Movie_Date, Movie_Time;
	Movieddl* next;
	Movieddl* prev;
};
Movieddl* M_head = NULL;

void addMoviedetails()
{
	Movieddl* newnode = new Movieddl();
	string iname, idate, itime;
	cout << "\n\t\t Movie Name:";
	cin.ignore();
	getline(cin, iname);
	cout << "\n\t\t Movie Date:";
	getline(cin, idate);
	cout << "\n\t\t Movie Time:";
	getline(cin, itime);
	newnode->Movie_Name = iname;
	newnode->Movie_Date = idate;
	newnode->Movie_Time = itime;
	if (M_head == NULL)
	{
		newnode->next = NULL;
		newnode->prev = NULL;
		M_head = newnode;
		return;
	}
	else
	{
		Movieddl* temp = M_head;
		while (temp->next != NULL)
		{
			temp = temp->next;
		}
		temp->next = newnode;
		newnode->prev = temp->next;
		newnode->next = NULL;
	}
}

void updateMovies()
{
	string mName;
u_M:
	int d = 1;
	int flag = 0;
	displayMovies(d);
	cout << "Enter Movie name you want to update: ";
	cin.ignore();
	getline(cin, mName);
	Movieddl* temp = M_head;
	while (temp != NULL)
	{
		if (mName == temp->Movie_Name)
		{
			cout << "\n\t\t Enter updated Movie Name : ";
			getline(cin, temp->Movie_Name);
			cout << "\n\t\t Enter updated Date : ";
			getline(cin, temp->Movie_Date);
			cout << "\n\t\t Enter updated Time : ";
			getline(cin, temp->Movie_Time);
			flag++;
			return;
		}
		temp = temp->next;
	}
	if (flag == 0)
	{
		cout << "Movie Not Found!, try again:";
		system("pause");
		system("cls");
		goto u_M;
	}
}

void displayMovies(int d)
{
	fstream file, file2;
	Movieddl* temp = M_head;
	if (d == 0)
	{
		file2.open("Movie_Details.txt", ios::in | ios::out | ios::trunc);
		file.open("Movie_Details.txt", ios::in | ios::out | ios::app);
		while (temp != NULL)
		{
			file << "\n\t\t Movie Name: " << temp->Movie_Name << endl;
			file << "\n\t\t Movie Date: " << temp->Movie_Date << endl;
			file << "\n\t\t Movie Time: " << temp->Movie_Time << endl << endl;
			temp = temp->next;
		}
		file2.close();
		file.close();
	}
	else if (d == 1)
	{
		while (temp != NULL)
		{
			cout << "\n\t\t Movie Name: " << temp->Movie_Name << endl;
			cout << "\n\t\t Movie Date: " << temp->Movie_Date << endl;
			cout << "\n\t\t Movie Time: " << temp->Movie_Time << endl << endl;
			temp = temp->next;
		}
	}
}

void view_movies()
{
	fstream file, file2;
	file.open("Movie_Details.txt", ios::in | ios::out);
	string text;
	while (!file.eof())
	{
		getline(file, text);
		cout << "\n\t\t" << text << endl;
	}
	file.close();
}

void deleteMovies()
{
	string m_name;
	cout << "\n\n\t\tEnter the Name of the Movie you want to delete: ";
	cin.ignore();
	getline(cin, m_name);
	Movieddl* p, * q;
	q = M_head;
	p = M_head->next;
	if (m_name == q->Movie_Name)
	{
		M_head = p;
		delete(q);
		p->prev = NULL;
	}
	else
	{
		while (p->Movie_Name != m_name)
		{
			p = p->next;
			q = q->next;
		}
		if (p->next == NULL)
		{
			q->next = NULL;
			delete(p);
		}
		else
		{
			q->next = p->next;
			p->next->prev = q;
			delete(p);
		}
	}
}

int searchmovie(string n_movie) 
{
    Movieddl* temp = M_head;
    int flag = 0;
    while (temp != NULL) 
    {
        if (n_movie == temp->Movie_Name) 
        {
            flag++;
            return 1;  // Movie found
        }
        temp = temp->next;
    }
    return 0;  // Movie not found
}

//-----------------------------------------------------BookTicket Block---------------------------------------------------
int iAv_Ticket[7][7] = { 0 }; // Initialize to 0
void Display(int Payment);
void ConfirmTransaction(int Av_Tickets[][7]);

void BookTicket()
{
	char choice_B;
	for (int i = 0; i < 7; i++) 
	{
		for (int j = 0; j < 7; j++)
		{
			if (iAv_Ticket[i][j] == 0)
			{
				cout << "\t| " << i << j << " |\t";
			}
			else
			{
				cout << "\t| " << "XX" << " |\t";
			}
		}
		cout << endl << endl;
	}

	for (int i = 0; i < 7; i++) 
	{
		for (int j = 0; j < 7; j++)
		{
		Ticket_Booking:
			cout << "\n\t\t Do you want to book a Seat/ticket? (Y/N):";
			cin >> choice_B;
			if (choice_B == 'Y' || choice_B == 'y')
			{
				cout << "\n\t\t Select Row and Column (0 1) :";
				cin >> i >> j;
				if(iAv_Ticket[i][j] == 1)
				{
					cout << "\n\t\t Ticket Cannot Be Booked, It is already Booked by user!";
					cout << "\n\t\t Trying Booking any other movie!\n";
					goto Ticket_Booking;
				}
				iAv_Ticket[i][j] = 1;
				i = 0;
				j = 0;
			}
			else if (choice_B == 'N' || choice_B == 'n')
			{
				i = 6;
				j = 6;
				system("cls");
				break;
			}
			else
			{
				cout << "\n\n\t\t Wrong Input!\n\n";
			}
		}
	}
}

void Booked_Tickets()
{
	char choice_b = ' ';
	cout << "\t\t\t******************************************************\n";
	cout << "\t\t\t\t\tMovie Management System\n";
	cout << "\t\t\t******************************************************\n\n";
	cout << "\t\t\t\t\t<<<<<< Seat Left >>>>>>\n\n";
	string text;
	for (int i = 0; i < 7; i++)
	{
		for (int j = 0; j < 7; j++)
		{
			if (iAv_Ticket[i][j] == 0)
			{
				cout << "\t| " << i << j << " |\t";
			}
			else
			{
				cout << "\t| " << "XX" << " |\t";
			}
		}
		cout << "\n\n";
	}
	cout << "\t\t";

	ConfirmTransaction(iAv_Ticket);
}

void ConfirmTransaction(int Av_Tickets[][7])
{
	int Payment = 0;
	// Transaction Operation
	for (int i = 0; i < 7; i++)
	{
		for (int j = 0; j < 7; j++)
		{
			if (Av_Tickets[i][j] == 1)
			{
				Payment++;
			}
			else
			{
				continue;
			}
		}
	}
	Display(Payment);
}

void Display(int Payment)
{
	//For Current Time and Date
	struct tm newtime;
	time_t t = time(0);
	localtime_s(&newtime, &t);
	int Month = 1 + newtime.tm_mon;
	int Day = newtime.tm_mday;
	int Year = newtime.tm_year + 1900;
	int hour = newtime.tm_hour;
	int minuts = newtime.tm_min;
	int sec = newtime.tm_sec;

	string Movie_Name, Customer_Name, Customer_Number;
	int x, TicketPrice = 600, totalPayment = 0, choice = 0;
	char Student;
	int d = 1;
	cout << "\n\t\t--------------------------------------------\n";
	displayMovies(d);
	cout << "\n\t\t--------------------------------------------\n";
	cout << "\n\t\t Enter Movie Name you want to see: ";
	cin.ignore();
	getline(cin, Movie_Name);
	cout << "\n\t\t Enter Your Name: ";
	getline(cin, Customer_Name);
	cout << "\n\t\t Enter Your Mobile Number: ";
	getline(cin, Customer_Number);
	cout << "\n\t\t Are You Student(Y/N): ";
	cin >> Student;
	cout << "\n\n\t\t*****************  BILL  *******************";
	cout << "\n\n\t\t********* Movie Management System ***********";
	cout << "\n\t\t\t Name: " << Customer_Name;
	cout << "\n\t\t\t Movie Name: " << Movie_Name;
	cout << "\n\t\t\t Mobile Number: " << Customer_Number;
	cout << "\n\t\t\t Seat Price: " << TicketPrice;
	if (Student == 'Y' || Student == 'y')
	{
		cout << "\n\t\t\t Student Discount: 50%\n";
		cout << "\t\t\t Original Ticket Price = " << TicketPrice;
		TicketPrice = TicketPrice / 2;
		cout << "\n\t\t\t Discounted Ticket Price = " << TicketPrice << endl;
		cout << "\n\t\t\t Date: " << Day << "/" << Month << "/" << Year;
		cout << "\t\t Time: " << hour << ":" << minuts << ":" << sec << "\n";
		cout << "\n\n\t\t\t Total Payment of: " << Payment * TicketPrice << " PKR\n\n";
	}
	else
	{
		cout << "\n\n\t\t\t Date: " << Day << "/" << Month << "/" << Year;
		cout << "\t\t Time: " << hour << ":" << minuts << ":" << sec << "\n";
		cout << "\n\n\t\t\t Total Payment of: " << Payment * TicketPrice << " PKR\n\n";
	}
	system("pause");
	system("cls");
}

//----------------------------LoginBlock-------------------------------------//
void login()
{
	string User_Name, PassWord;
	int login_attempt = 0;
	while (login_attempt < 5)
	{
		cout << "\n\n\t\tPlease Enter your User name: ";
		cin >> User_Name;
		cout << "\n\t\tPlease Enter your User Password: ";
		cin >> PassWord;
		if (User_Name == "Admin" && PassWord == "Admin123")
		{
			cout << "\n\t\tWelcome to the Movie Management System\n\n";
			break;
		}
		else
		{
			cout << "\n\t\tInvalid login attempt. Please try again.\n\n";
			login_attempt++;
		}
	}
	if (login_attempt == 5)
	{
		cout << "Too many login attempts! The program will now terminate.";
		exit(0);
	}
	system("cls");
}

//-----------------------MenuBlock-----------------------------------//
void menu()
{
	char ch;
	while (1)
	{
		cout << "\t\t\t******************************************************\n";
		cout << "\t\t\t\t\tMovie Management System\n";
		cout << "\t\t\t******************************************************\n\n";
		cout << "\t\t1.Add Movies\n";
		cout << "\t\t2.Update Movies\n";
		cout << "\t\t3.Delete Movies\n";
		cout << "\t\t4.Display Movies\n";
		cout << "\t\t5.Book Tickets\n";
		cout << "\t\t6.View Booked Tickets\n";
		cout << "\t\t7.Exit\n\n";
		cout << "\t\t******************************************************\n";
		cout << "\n\t\tEnter Your Choice : ";
		cin >> ch;
		switch (ch)
		{
		case '1':
			system("cls");
			addMoviedetails();
			break;
		case '2':
			system("cls");
			updateMovies();
			break;
		case '3':
			system("cls");
			deleteMovies();
			break;
		case '4':
			system("cls");
			view_movies();
			break;
		case '5':
			system("cls");
			BookTicket();
			break;
		case '6':
			system("cls");
			Booked_Tickets();
			break;
		case '7':
			exit(0);
		default:
			cout << "\n\t\t Invalid Choice! Try again.";
			break;
		}
	}
}

int main()
{
	login();
	menu();
}