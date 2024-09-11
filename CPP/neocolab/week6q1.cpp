#include <iostream>
#include <cmath>
using namespace std;
int numBuckets(int numElements){
    return (int) pow(numElements,3);
}
int hashFunc(string elt,int numElements){
    return(((elt.at(0)-'a')*(pow(numElements,2)))+((elt.at(1)-'a')*(pow(numElements,1)))+((elt.at(2)-'a')));
}
int main(){
    int count;
    cin>>count;
    int arr[numBuckets(count)];
    for(int i=0;i<count;i++){
        string key;
        cin>>key;
        cout<<hashFunc(key,count)<<endl;
    }
    return 0;
}