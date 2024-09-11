/*Ava is designing a scheduling system for a manufacturing plant where jobs with varying processing times need to be scheduled. She requires a function to assist her in inserting new jobs into a binary max-heap, based on their processing time.



Write the code to help her insert a new job with its processing time into a binary max-heap.

Input format :
The input consists of a series of space-separated integers, representing the processing times of jobs, that are to be inserted into the heap.

Output format :
The output prints the binary max-heap, after inserting all the processing times of jobs.

Code constraints :
The maximum heap size is defined by maxSize (here set to 100).

Sample test cases :
Input 1 :
10 5 15 20
Output 1 :
20 15 10 5 
Input 2 :
8 3 12 6
Output 2 :
12 6 8 3 */
#include <iostream>
#include <vector>
#include <algorithm>

void insertJob(std::vector<int> &maxHeap, int job) {
    maxHeap.push_back(job);
    std::push_heap(maxHeap.begin(), maxHeap.end(), std::less<int>());
}

int main() {
    int maxSize = 100;
    std::vector<int> maxHeap;

    std::cout << "Enter processing times of jobs separated by spaces: ";
    int job;
    while (std::cin >> job) {
        insertJob(maxHeap, job);
        if (std::cin.get() == '\n') {
            break;
        }
    }

    std::make_heap(maxHeap.begin(), maxHeap.end(), std::less<int>());

    std::cout << "Binary Max-Heap: ";
    for (int i : maxHeap) {
        std::cout << i << ' ';
    }
    std::cout << std::endl;

    return 0;
}
