#include <iostream>
using namespace std;
struct Node{
    int data;
    struct Node* prev;
    struct Node* next;
    Node(int val){
        data=val;
        prev=NULL;
        next=NULL;
    }
};
void insertAtHead(Node* &head,int val){
    Node* n=new Node(val);
    n->next=head;
    if(head!=NULL){
    head->prev=n;
    }
    head=n;
}
void insertAtTail(Node* &head,int val){
    Node* n=new Node(val);
    if(head==NULL){
        insertAtHead(head,val);
        return;
    }
    Node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
    n->prev=temp;
}
void display(Node* head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }  
    cout<<"NULL"<<endl;
}
void displayback(Node* head){
    Node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->prev;
    }
    cout<<"NULL"<<endl;
}
void deletion(Node* &head,int val){
    Node* temp=head;
    while(temp->data!=val){
        temp=temp->next;
    }
    temp->prev->next=temp->next;
    if(temp->next!=NULL){
    temp->next->prev=temp->prev;
    }
    delete temp;
}
int main(){
    Node* head=NULL;
    insertAtTail(head,5);
    insertAtTail(head,6);
    insertAtTail(head,7);
    insertAtTail(head,8);
    insertAtTail(head,9);
    display(head);
    cout<<"\n";
    displayback(head);
    cout<<"After Deletion:"<<endl;
    deletion(head,9);
    deletion(head,8);
    display(head);
    return 0;
}