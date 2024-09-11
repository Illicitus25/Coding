#include <iostream>
#include <cmath>
using namespace std;
static const int PRIME=31;
static const int lenarr=3001;
int arr[lenarr];
int hashFunc(string key){
    size_t sum=0;
    for(int i=0;i<key.length();i++){
        sum+=((int)key[i]*(int)pow(PRIME,i))%lenarr;
    }
    return sum%lenarr;
}
void put(string key,int value){
    int index=hashFunc(key);
    arr[index]=value;
}
void printAll(){
    for(int i=0;i<lenarr;i++){
        if(arr[i]>0){
            cout<<i<<"="<<arr[i]<<endl;
        }
    }
    cout<<endl;
}
int main(){
    int count;
    cin>>count;
    for(int i=0;i<count;i++){
        string key;
        int val;
        cin>>key;
        cin>>val;
        put(key,val);
    }
    printAll();
    return 0;
}