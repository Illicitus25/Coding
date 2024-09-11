#include <iostream>
using namespace std;
struct Node{
    int data;
    struct Node* prev;
    struct Node* next;
    Node(int val){
        data=val;
        prev=nullptr;
        next=nullptr;
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
    while(temp->next!=nullptr){
        temp=temp->next;
    }
    temp->next=n;
    n->prev=temp;
}
void deleteAtHead(Node* &head){
    Node* todelete=head;
    head=head->next;
    head->prev=nullptr;
    delete todelete;
}
void deletion(Node* &head,int val){
    if(head->data==val){
        deleteAtHead(head);
        return;
    }
    Node* temp=head;
    while(temp->data!=val){
        temp=temp->next;
    }
    temp->prev->next=temp->next;
    if(temp->next!=nullptr){
    temp->next->prev=temp->prev;
    }
    delete temp;
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
    Node* head=NULL;
    insertAtTail(head, 1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtTail(head,4);
    display(head);
    insertAtHead(head,5);
    display(head);
    deletion(head,5);
    display(head);
    return 0;
}