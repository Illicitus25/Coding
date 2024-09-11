/*As a developer in an IT company, your task is to schedule tasks depending on their time consumption, arranging them in descending order from highest to lowest time consumption. 



Write code to convert the elements into a max heap and then print the sum of the first and last elements in the max heap.

Input format :
The first line of input consists of an integer value, n, representing the number of elements.

The second line of input consists of n integer values, separated by space.

Output format :
The first line of the output prints the elements in the max-heap, separated by a space.

The second line of the output displays the sum of the first and the last value of the max-heap.



Refer to the sample output for exact format specifications.

Code constraints :
1<=number of elements<=10

1<=elements in max heap<=150

Sample test cases :
Input 1 :
5
1 2 3 4 5
Output 1 :
5 4 3 1 2 
7
Input 2 :
5
9 8 7 6 5
Output 2 :
9 8 7 6 5 
14*/
#include <iostream>
#include <vector>
#include <algorithm>

void buildMaxHeap(std::vector<int> &maxHeap) {
    int n = maxHeap.size();
    for (int i = n / 2 - 1; i >= 0; i--) {
        int currentIndex = i;
        while (true) {
            int leftChild = 2 * currentIndex + 1;
            int rightChild = 2 * currentIndex + 2;
            int largest = currentIndex;

            if (leftChild < n && maxHeap[leftChild] > maxHeap[largest]) {
                largest = leftChild;
            }

            if (rightChild < n && maxHeap[rightChild] > maxHeap[largest]) {
                largest = rightChild;
            }

            if (largest != currentIndex) {
                std::swap(maxHeap[currentIndex], maxHeap[largest]);
                currentIndex = largest;
            } else {
                break;
            }
        }
    }
}

int main() {
    int n;
    std::cin >> n;
    std::vector<int> maxHeap(n);

    for (int i = 0; i < n; i++) {
        std::cin >> maxHeap[i];
    }

    buildMaxHeap(maxHeap);

    std::cout << "Elements in the max-heap: ";
    for (int i : maxHeap) {
        std::cout << i << ' ';
    }
    std::cout << std::endl;

    int sum = maxHeap[0] + maxHeap[n - 1];
    std::cout << "Sum of the first and last element: " << sum << std::endl;

    return 0;
}
