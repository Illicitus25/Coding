#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[], int l, int r, int x)
{
    while (l <= r) {
        int m = l + (r - l) / 2;
        if (arr[m] == x)
            return m;
        if (arr[m] < x)
            l = m + 1;
        else
            r = m - 1;
    }
    return -1;
}
int main(){
    int arr[]={1,23,4,5,6,7,8,9,4526,6,34,352,65,345,2345,2345,45};
    int key=65;
    int n=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+n);
    if(binarySearch(arr,0,n-1,key)==-1){
        cout<<"Value not found";
    }
    else{
        cout<<"Value found";
    }
    return 0;
}