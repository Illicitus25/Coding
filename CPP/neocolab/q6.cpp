/*John is managing a library and wants to keep track of the popularity of the books in his collection. He needs a program that allows him to insert new books, each with a popularity rating, into a max heap.



Write a program that helps John insert new books into a max heap based on their popularity ratings.

Input format :
The input consists of a series of space-separated integers, each representing the popularity rating of a book.

Output format :
The output displays the popularity ratings of the books in the max heap, separated by spaces.

Code constraints :
The maximum number of books that can be inserted is 100, as the max heap has a maximum capacity of 100.

Sample test cases :
Input 1 :
15 10 20 5 30
Output 1 :
30 20 15 5 10 
Input 2 :
50 20 70 15 30
Output 2 :
70 30 50 15 20 */
#include <iostream>
#include <vector>
#include <algorithm>

void insertBook(std::vector<int> &maxHeap, int rating) {
    maxHeap.push_back(rating);
    std::push_heap(maxHeap.begin(), maxHeap.end(), std::less<int>());
}

int main() {
    std::vector<int> maxHeap;

    std::cout << "Enter popularity ratings of books separated by spaces: ";
    int rating;
    while (std::cin >> rating) {
        insertBook(maxHeap, rating);
        if (std::cin.get() == '\n') {
            break;
        }
    }

    std::cout << "Popularity ratings in the max-heap: ";
    for (int r : maxHeap) {
        std::cout << r << ' ';
    }
    std::cout << std::endl;

    return 0;
}
