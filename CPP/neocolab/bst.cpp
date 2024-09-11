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
    else if(value<root->data){
        root->left=insert(root->left,value);
    }
    else if(value>root->data){
        root->rigiht=insert(root->right,value)
    }
    return root;
}
void inorder(Node* root){
    if(root==nullptr){
        return;
    }
    inorder(root->left);
    cout<<root->data<<endl;
    inorder(root->right);
}