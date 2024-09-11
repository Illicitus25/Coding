#include <iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    string s;
    int c=0;
    string arr[n];
    cin.ignore();
    getline(cin,s);
    int pos=0;
    for(int i=0;i<s.length();i++){
        if(s[i]==' '){
            arr[c]=s.substr(pos,i);
            pos=i+1;
            c++;
        }
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}