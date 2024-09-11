#include <bits/stdc++.h>
using namespace std;
int main(){
    int arr[]={10,9,8,7,6,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+n,greater<int>());
    for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}