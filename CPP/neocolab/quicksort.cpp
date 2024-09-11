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
        root->right=insert(root->right,value);
    }
    return root;
}
void inorder(Node* root){
    if(root==nullptr){
        return;
    }
    inorder(root->left);
    cout<<root->data<<" `";
    inorder(root->right);
}
int partition(int arr[], int start, int end)
{
	int pivot = arr[start];
	int count = 0;
	for (int i = start + 1; i <= end; i++) {
		if (arr[i] <= pivot)
			count++;
	}
	int pivotIndex = start + count;
	swap(arr[pivotIndex], arr[start]);
	int i = start, j = end;
	while (i < pivotIndex && j > pivotIndex) {

		while (arr[i] <= pivot) {
			i++;
		}

		while (arr[j] > pivot) {
			j--;
		}

		if (i < pivotIndex && j > pivotIndex) {
			swap(arr[i++], arr[j--]);
		}
	}

	return pivotIndex;
}

void quickSort(int arr[], int start, int end)
{
	if (start >= end)
		return;
	int p = partition(arr, start, end);
	quickSort(arr, start, p - 1);
	quickSort(arr, p + 1, end);
}

int main()
{
    Node* root=nullptr;
	int arr[] = { 9, 3, 4, 2, 1, 8 };
	int n = 6;
    int arr1[n];

	quickSort(arr, 0, n - 1);
    int c=0;
	for (int i = 0; i < n/2; i++) {
		arr1[c]=arr[i];
        c++;
	}
    cout<<endl;
    for (int i = n-1; i >= n/2; i--) {
		arr1[c]=arr[i];
        c++;
	}
    for(int i=0;i<n;i++){
        root=insert(root,arr1[i]);
    }
    inorder(root);
	return 0;
}