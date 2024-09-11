 #include <iostream>
 using namespace std;
 struct node{
    int data;
    struct node* left;
    struct node* right;
    node(int val){
        data=val;
        left=nullptr;
        right=nullptr;
    }
 };
  node* insert(node* root, int value){
    if(root==nullptr){
        return new node(value);
    }
    if(value<root->data){
        root->left=insert(root->left,value);
    }
    else if(value>root->data){
        root->right=insert(root->right,value);
    }
    return root;
 }
  node* search(node* root,int val){
    while(root!=nullptr && root->data!=val){
        root=val<root->data?root->left:root->right;
    }
    return root;
  }
  void inorder(node* root){
    if(root==nullptr){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
  }
  node* deleteleaf(node* root){
    if(root==nullptr){
        return NULL;
    }
    if(root->left==nullptr && root->right==nullptr){
        free(root);
        return NULL;
    }
        root->left=deleteleaf(root->left);
        root->right=deleteleaf(root->right);
        return root;
  }
  int main(){
     node* root=nullptr;
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
    if(search(root,key)==0){
        cout<<"\nnot found";
    }
    else{
        cout<<"\nfound";
    }
    cout<<"Inorder\n";
    inorder(root);
    deleteleaf(root);
    cout<<"After leaf deletion:"<<endl;
    inorder(root);
    return 0;
  }