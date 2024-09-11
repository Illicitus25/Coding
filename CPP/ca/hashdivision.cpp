#include <iostream>
using namespace std;
int divisionMethod(int key,int tablesize){
    return key%tablesize;
}
int main(){
    int tablesize=10;
    int numkeys;
    cin>>numkeys; 
    int keys[numkeys];
    for(int i=0;i<numkeys;i++){
        cin>>keys[i];
    }
    int hashtable[tablesize];
    for(int i=0;i<tablesize;i++){
        hashtable[i]=-1;
    }
    for(int i=0;i<numkeys;i++){
        int key=keys[i];
        int hashindex=divisionMethod(key,tablesize);
        while(hashindex<tablesize){
            if(hashtable[hashindex]==-1){
                hashtable[hashindex]=key;
                break;
            }
            else{
                hashindex=(hashindex+1)%tablesize;
                }
        }
    }
    for(int i=0;i<tablesize;i++){
        if(hashtable[i]!=-1){
            cout<<"Table Number"<<i<<": Customer ID"<<hashtable[i]<<endl;
        }
    }
    return 0;
}