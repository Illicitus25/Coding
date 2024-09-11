#include <iostream>
#include <sstream>
using namespace std;
int main(){
    int n;
    int c=0;
    cin>>n;
    string s;
    string arr[n];
    cin.ignore();
    getline(cin,s);
    stringstream st(s);
    string word;
    while(st>>word){
        arr[c]=word;
        c++;
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}