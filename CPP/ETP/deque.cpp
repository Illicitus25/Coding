#include <iostream>
#include <deque>

using namespace std;

int main() {
    deque<int> myDeque;

    myDeque.push_back(10);
    myDeque.push_back(20);
    myDeque.push_front(5);
    while(!myDeque.empty()){
        cout<<myDeque.front()<<" ";
        myDeque.pop_front();
    }
    return 0;
}
