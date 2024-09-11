#include <iostream>
using namespace std;
void merge(int arr[],int si,int mid,int ei){
    int temp[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
        }
        else{
            temp[k++]=arr[j++];
        }
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    for(int i=0,j=si;i<ei-si+1;i++,j++){
        arr[j]=temp[i];
    }
}
void sort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int mid=(si+ei)/2;
    sort(arr,si,mid);
    sort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
}
int main(){
    int arr[]={6,3,9,5,2,8};
    sort(arr,0,5);
    for(int i=0;i<6;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}