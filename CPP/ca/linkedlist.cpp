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
void insertattail(Node* &head,int val){
    Node* n=new Node(val);
    Node* temp=head;
    if(head==NULL){
        head=n;
        return;
    }
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
}
void insertathead(Node* &head,int val){
    Node* n=new Node(val);
    if(head==NULL){
        head=n;
        return;
    }
    n->next=head;
    head=n;
}
void deleteAtHead(Node* &head){
    Node* todelete=head;
    head=head->next;
    delete todelete;
}
void deletion(Node* &head,int val){
    Node* temp=head;
    if(head==NULL){
        return;
    }
    if(head->next==NULL){
        deleteAtHead(head);
        return;
    }
    while(temp->next->data!=val){
       temp=temp->next; 
    }
    Node* todelete=temp->next;
    temp->next=temp->next->next;
    delete todelete;
}
bool search(Node* head,int val){
    Node* temp=head;
    while(head!=NULL){
        if(temp->data==val){
            return true;
        }
        temp=temp->next;
    }
    return false;
}
void display(Node* head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
int main(){
    Node* head=NULL;
    insertattail(head,1);
    insertattail(head,2);
    insertattail(head,3);
    insertathead(head,4);
    display(head);
    cout<<search(head,4)<<endl;
    deleteAtHead(head);
    deletion(head,3);
    display(head);
    return 0;
}