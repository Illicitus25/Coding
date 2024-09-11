#include <iostream>
using namespace std;
struct Node{
    int data;
    struct Node* next;
    Node(int val){
        data=val;
        next=nullptr;
    }
};
void insert(Node* &head,int val){
    Node* n=new Node(val);
    if(head==nullptr){
        head=n;
        return;
    }
    Node* temp=head;
    while(temp->next!=nullptr){
        temp=temp->next;
    }
    temp->next=n;
}
void deletion(Node* &head,int val){
    Node* temp=head;
    Node* prev=nullptr;
    if(temp!=nullptr && temp->data==val){
        head=temp->next;
        delete temp;
        return;
    }
    while(temp!=nullptr && temp->data!=val){
        prev=temp;
        temp=temp->next;
    }
    if(temp==nullptr){
        cout<<"Value not found"<<endl;
        return;
    }
    prev->next=temp->next;
    delete temp;
}
bool search(Node* head,int val){
    Node* temp=head;
    while(temp!=nullptr){
        if(temp->data==val){
            return true;
        }
        temp=temp->next;
    }
    return false;
}
void display(Node* head){
    Node* temp=head;
    while(temp!=nullptr){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
int main(){
    Node*head=nullptr;
    insert(head,5);
    insert(head,10);
    insert(head,15);
    insert(head,20);
    cout<<"Original list:"<<endl;
    display(head);
    deletion(head,15);
    cout<<"List after deletion:"<<endl;
    display(head);
    int s=20;
    if(search(head,s)){
        cout<<"Value found";
    }
    else{
        cout<<"Value not found";
    }
    return 0;
}