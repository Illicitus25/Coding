#include <iostream>
#include <queue>
#include <vector>
using namespace std;
int main(){
    priority_queue<int,vector<int>>pq;
    pq.push(3);
    pq.push(2);
    pq.push(1);
    priority_queue<int,vector<int>,greater<int>>pqm;
    pqm.push(3);
    pqm.push(2);
    pqm.push(1);
    cout<<"MAXHEAP:"<<pq.top()<<endl;
    cout<<"MINHEAP:"<<pqm.top()<<endl;
    while(!pq.empty()){
        cout<<pq.top()<<" ";
        pq.pop();
    }
    return 0;
}