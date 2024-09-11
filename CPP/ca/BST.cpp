#include <iostream>
using namespace std;
struct Node{
    int data;
    struct Node* left;
    struct Node* right;
    Node(int val){
        data=val;
        left=nullptr;
        right=nullptr;
    }
};
Node* insert(Node* root,int value){
    if(root==nullptr){
        return new Node(value);
    }
    if(value<root->data){
        root->left=insert(root->left,value);
    }
    else if(value> root->data){
        root->right=insert(root->right,value);
    }
    return root;
}
Node* search(Node* root,int val){
    while(root!=nullptr && root->data!=val ){
        root=val<root->data?root->left:root->right;
    }
    return root;
}
void inorder(Node* root){//left->root->right
    if(root==nullptr){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}
void preorder(Node* root){//root->keft->right
    if(root==nullptr){
        return;
    }
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}
void postorder(Node* root){//left->right->root
    if(root==nullptr){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" ";
}
int main(){
    Node* root=nullptr;
    int n,key;
    cout<<"Enter number of Nodes:"<<endl;
    cin>>n;
    for(int i=0;i<n;i++){
        int data;
        cout<<"Enter node value: ";
        cin>>data;
        root=insert(root,data);
    }
    cout<<"Enter value to search"<<endl;
    cin>>key;
    cout<<"Inorder\n";
    inorder(root);
    cout<<"\nPreorder\n";
    preorder(root);
    cout<<"\nPostorder\n";
    postorder(root);
    
    if(search(root,key)==0){
        cout<<"\nnot found";
    }
    else{
        cout<<"\nfound";
    }
    return 0;
}