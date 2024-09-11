#include <iostream>
#include <queue>

using namespace std;

int main() {
    // Creating a priority queue of integers
    priority_queue<int,vector<int>,greater<int>> pq;

    // Inserting elements into the priority queue
    pq.push(30);
    pq.push(10);
    pq.push(50);
    pq.push(20);

    // Size of the priority queue
    cout << "Size of the priority queue: " << pq.size() << endl;

    // Accessing the top element (highest priority)
    cout << "Top element of the priority queue: " << pq.top() << endl;

    // Removing elements from the priority queue
    cout << "Removing elements from the priority queue: ";
    while (!pq.empty()) {
        cout << pq.top() << " ";
        pq.pop();
    }
    cout << endl;

    return 0;
}
