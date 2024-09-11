/*
David is designing a navigation system for a delivery drone. He wants to implement a function that allows him to insert new delivery locations into a min heap based on their distances from the current location.



Write a code to help him insert new delivery locations into a min heap.

Input format :
The input consists of a sequence of space-separated integers representing the distances of delivery locations from the current location.

Output format :
The output consists of the distances of delivery locations stored in the min heap. Each distance is separated by a space.

Code constraints :
The maximum number of delivery locations is 100 (specified by the size of the min heap array).

Sample test cases :
Input 1 :
5 3 8 2 9 1 7 6 4
Output 1 :
1 3 2 4 9 8 7 6 5 
Input 2 :
10 20 30 40 50
Output 2 :
10 20 30 40 50 */
#include <iostream>
#include <vector>
#include <algorithm>

void insertLocation(std::vector<int> &minHeap, int distance) {
    minHeap.push_back(distance);
    std::push_heap(minHeap.begin(), minHeap.end(), std::greater<int>());
}

int main() {
    int maxSize = 100;
    std::vector<int> minHeap;

    std::cout << "Enter distances of delivery locations separated by spaces: ";
    int distance;
    while (std::cin >> distance) {
        insertLocation(minHeap, distance);
        if (std::cin.get() == '\n') {
            break;
        }
    }

    std::cout << "Distances of delivery locations in the min-heap: ";
    for (int d : minHeap) {
        std::cout << d << ' ';
    }
    std::cout << std::endl;

    return 0;
}
