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
void insertathead(Node* &head,int val){
    Node* n=new Node(val);
    if(head==NULL){
        n->next=n;
        head=n;
        return;
    }
    Node* temp=head;
    while(temp->next!=head){
        temp=temp->next;
    } 
    temp->next=n;
    n->next=head;
    head=n;
}
void insertattail(Node* &head,int val){
    Node* n=new Node(val);
    Node* temp=head;
    if(head==NULL){
        insertathead(head,val);
        return;
    }
    while(temp->next!=head){ 
        temp=temp->next;
    }
    temp->next=n;
    n->next=head;
}
void deleteAtHead(Node* &head){
    Node* temp=head;
    while(temp->next!=head){
        temp=temp->next;
    }
    Node* todelete=head;
    temp->next=head->next;
    head=head->next;
    delete todelete;
}
void deletion(Node* &head,int pos){
    if(pos==1){
        deleteAtHead(head);
        return;
    }
    Node* temp=head;
    int count=1
    while(count!=pos-1){
        temp=temp->next;
        count++;
    }
    Node* todelete=temp->next;
    temp->next=temp->next->next;
    delete todelete;
}
bool search(Node* head,int val){
    Node* temp=head;
    do{
        if(temp->data==val){
            return true;
        }
        temp=temp->next;
    }
    while(temp!=head);
    return false;
}
void display(Node* head){
    Node* temp=head;
    do{
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    while(temp!=head);
        cout<<endl; 
}
int main(){
    Node* head=NULL;
    insertattail(head,1);
    insertattail(head,2);
    insertattail(head,3);
    insertathead(head,4);
    display(head);
    cout<<search(head,5);
    return 0;
}