/*Emily is developing a simple chat application where messages are represented as single characters. She needs to create a program that allows her to insert new messages into a max heap.



Write a program to assist Emily in inserting new chat messages (each represented by a single character) into a max heap.After inserting each message into the max heap, the program should display the current state of the max heap.

Input format :
The input consists of a series of space-separated characters, with each character representing a chat message.

Output format :
The output displays the characters of the messages in the max heap, ordered by their ASCII values.

Code constraints :
The maximum number of messages that can be inserted is 100, as the max heap has a maximum capacity of 100.

Sample test cases :
Input 1 :
c b a d e
Output 1 :
e d a b c 
Input 2 :
z y x
Output 2 :
z y x */
#include <iostream>
#include <vector>
#include <algorithm>

void insertMessage(std::vector<char> &maxHeap, char message) {
    maxHeap.push_back(message);
    std::push_heap(maxHeap.begin(), maxHeap.end(), std::less<char>());
}

int main() {
    int maxSize = 100;
    std::vector<char> maxHeap;

    std::cout << "Enter chat messages separated by spaces: ";
    char message;
    while (std::cin >> message) {
        insertMessage(maxHeap, message);
        if (std::cin.get() == '\n') {
            break;
        }
    }

    std::cout << "Messages in the max-heap: ";
    for (char m : maxHeap) {
        std::cout << m << ' ';
    }
    std::cout << std::endl;

    return 0;
}
