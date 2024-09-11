#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int deletion(int arr[], int x, int n) {
    int i;
    for (i = 0; i < n; i++) {
        if (arr[i] == x) {
            break;
        }
    }
    if (i < n) {
        n = n - 1;
        for (int j = i; j < n; j++) {
            arr[j] = arr[j + 1];
        }
    }
    return n;
}
int linearsearch(int arr[],int s,int n){
    for (int i = 0; i < n; i++) {
        if(arr[i]==s){
            return i;
        }
    }
    return -1;
}
int binarysearch(int arr[],int s,int n){
    int l=0;
    int r=n-1;
    while(l<=r){
        int m=l+(r-l)/2;
         // Check if x is present at mid
        if (arr[m] == x)
            return m;
 
        // If x greater, ignore left half
        if (arr[m] < x)
            l = m + 1;
 
        // If x is smaller, ignore right half
        else
            r = m - 1;
    }
}
void selectionSort(int arr[], int n)
{
    int i, j, min_idx;
 
    // One by one move boundary of
    // unsorted subarray
    for (i = 0; i < n-1; i++) {
 
        // Find the minimum element in
        // unsorted array
        min_idx = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx])
                min_idx = j;
        }
 
        // Swap the found minimum element
        // with the first element
        if (min_idx != i)
            swap(arr[min_idx], arr[i]);
    }
}
void bubbleSort(int arr[], int n) 
{ 
    int i, j; 
    for (i = 0; i < n - 1; i++) 
  
        // Last i elements are already 
        // in place 
        for (j = 0; j < n - i - 1; j++) 
            if (arr[j] > arr[j + 1]) 
                swap(arr[j], arr[j + 1]); 
} 
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
 
        // Move elements of arr[0..i-1],
        // that are greater than key, 
        // to one position ahead of their
        // current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
int main() {
    int n, x;
    cout << "Enter the number of elements in the array: ";
    cin >> n;
    int arr[n];
    cout << "Enter elements of the array:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    cout << "Enter the element to delete: ";
    cin >> x;

    cout << "Original Array:\n";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << "\n";

    n = deletion(arr, x, n);

    cout << "Array after deletion:\n";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
