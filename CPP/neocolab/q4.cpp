/*In a mysterious cave, explorers discovered a hidden chamber filled with enchanted crystals of varying sizes. They want to organize these crystals into a min-heap to harness their power. 



Write a program that helps them build the min-heap and find the kth smallest crystal's size, where k is a user-defined parameter.

Input format :
The first line contains an integer n, the number of crystals.

The next n lines contain the sizes of the crystals. Each line contains a single integer representing the size of a crystal.

The last line contains an integer k, indicating the position of the crystal you want to find.

Output format :
The first line prints the elements in the min-heap after construction.

The second line prints the size of the kth smallest crystal.



Refer to the sample output for formatting specifications.

Code constraints :
1 <= n <= 1000

1 <= k <= n

Sample test cases :
Input 1 :
5
3 5 2 6 8
12
Output 1 :
Invalid entry
Input 2 :
5
3 5 2 6 8
3
Output 2 :
Min heap is: 2 5 3 6 8 
The smallest crystal's size is 3*/
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

int findKthSmallest(const std::vector<int> &minHeap, int k) {
    return minHeap[k - 1];
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

    int kthSmallest = findKthSmallest(minHeap, k);
    std::cout << "The smallest crystal's size is " << kthSmallest << std::endl;

    return 0;
}
