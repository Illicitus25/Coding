#include <iostream>
using namespace std;
#define n 5
class Stack{
    public:
    int *arr;
    int top;
    Stack(){
        arr=new int[n];
        top=-1;
    }
    void push(int val){
        if(top>n-1){
            cout<<"Overflow"<<endl;
            return;
        }
        top++;
        arr[top]=val;
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
            cout<<"empty stack"<<endl;
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
    s.push(10);
    s.push(20);
    s.push(30);
     while (!s.empty()) {
        cout << s.peek() <<" ";
        s.pop();
    }
}