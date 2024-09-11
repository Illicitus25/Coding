/*A magician has placed the enchanted gemstones in an array, and your task is to convert the array into a min heap, which will help you identify the gemstone with the kth most potent magic.



Given an array of elements and an element k, find the kth element after converting the array into a min-heap.



Note: This question was asked in Cisco recruitment.

Input format :
The first line of input is an integer value, representing the number of elements in the array.

The second line of the input consists of space-separated integer array values.

The third line of the input is an integer value, k.

Output format :
The first line of the output prints the space-separated integer values in the min-heap.

The second line of the output prints the kth element in the min-heap.

If k>n, print "Invalid entry".



Refer to the sample output for formatting specifications.

Code constraints :
size of array>0

k<=size of array

Sample test cases :
Input 1 :
5
2 4 1 5 9
3
Output 1 :
Min heap is: 1 4 2 5 9 
Kth element in min heap is 2
Input 2 :
5
2 4 1 5 9
12
Output 2 :
Invalid entry*/
#include <iostream>
#include <vector>
#include <algorithm>

void buildMinHeap(std::vector<int> &minHeap) {
    int n = minHeap.size();
    for (int i = n / 2 - 1; i >= 0; i--) {
        int currentIndex = i;
        while (true) {
            int leftChild = 2 * currentIndex + 1;
            int rightChild = 2 * currentIndex + 2;
            int smallest = currentIndex;

            if (leftChild < n && minHeap[leftChild] < minHeap[smallest]) {
                smallest = leftChild;
            }

            if (rightChild < n && minHeap[rightChild] < minHeap[smallest]) {
                smallest = rightChild;
            }

            if (smallest != currentIndex) {
                std::swap(minHeap[currentIndex], minHeap[smallest]);
                currentIndex = smallest;
            } else {
                break;
            }
        }
    }
}

int main() {
    int n;
    std::cin >> n;
    std::vector<int> minHeap(n);

    for (int i = 0; i < n; i++) {
        std::cin >> minHeap[i];
    }

    int k;
    std::cin >> k;

    if (k < 1 || k > n) {
        std::cout << "Invalid entry" << std::endl;
        return 0;
    }

    buildMinHeap(minHeap);

    std::cout << "Min heap is: ";
    for (int i : minHeap) {
        std::cout << i << ' ';
    }
    std::cout << std::endl;

    std::cout << "Kth element in min heap is " << minHeap[k - 1] << std::endl;

    return 0;
}
