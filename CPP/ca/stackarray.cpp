#include <iostream>
using namespace std;
#define n 100
class Stack{
    public:
    int* arr;
    int top;
    Stack(){
        arr=new int[n];
        top=-1;
    }
    void push(int x){
        if(top==n-1){
            cout<<"Overflow"<<endl;
            return;
        }
        top++;
        arr[top]=x;
    }
    void pop(){
        if(top==-1){
            cout<<"Underflow"<<endl;
            return;
        }
        top--;
    }
    int peek(){
        if(top==-1){
            cout<<"stack is empty"<<endl;
            return -1;
        }
        return arr[top];
    }
    bool empty(){
        return top==-1;
    }
};
int main(){
    Stack s;
    s.push(1);
    s.push(2);
    s.push(3);
    cout<<s.peek()<<endl;
    s.pop();
    cout<<s.peek()<<endl;
    return 0;
}