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
Node* insertion(Node* root,int val){
    if(root==nullptr){
        return new Node(val);
    }
    if(val<root->data){
        root->left=insertion(root->left,val);
    }
    else if(val>root->data){
        root->right=insertion(root->right,val);
    }
    return root;
}
Node* search(Node* root,int key){
    while(root!=nullptr && root->data!=key){
        root=key<root->data?root->left:root->right;
    }
    return root;
}
Node* deletion(Node* root,int k){
    if(root==nullptr){
        return root;
    }
    if(k<root->data){
        root->left=deletion(root->left,k);
        return root;
    }
    else if(k>root->data){
        root->right=deletion(root->right,k);
        return root;
    }
    if(root->left==nullptr){
        Node* temp=root->right;
        delete root;
        return temp;
    }
    else if(root->right==nullptr){
        Node* temp=root->left;
        delete root;
        return temp;
    }
    else{
        Node* parent=root;
        Node* succ=root->right;
        while(succ->left!=nullptr){
            parent=succ;
            succ=succ->left;
        }
        if(parent!=root){
            parent->left=succ->right;
        }
        else{
            parent->right=succ->right;
        }
        root->data=succ->data;
        delete succ;
        return root;
    }
}
    void inorder(Node* root){
        if(root==nullptr){
            return;
        }
        inorder(root->left);
        cout<<root->data<<" ";
        inorder(root->right);
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
        root=insertion(root,data);
    }
    cout<<"Enter value to delete"<<endl;
    cin>>key;
    cout<<"Inorder\n";
    inorder(root);
    deletion(root,key);
    inorder(root);
    return 0;
    }