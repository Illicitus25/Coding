#include <iostream>
using namespace std;
void toh(int n,char from,char to,char aux){
    if(n==1){
        cout<<"Move disk 1 from rod "<<from<<" to rod "<<to<<endl;
        return;
    }
    toh(n-1,from,to,aux);
    cout<<"Move disk "<<n<<" from rod "<<from<<" to rod "<<to<<endl;
    toh(n-1,aux,to,from);
}
int main(){
    toh(3,'A','C','B');
    return 0;
}