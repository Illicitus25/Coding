/*In an online gaming platform, players have individual scores that determine their ranking on a leaderboard. The platform needs a program to manage and display the leaderboard efficiently using a max heap. The player with the highest score should be at the top of the leaderboard.



Write a program that assists the gaming platform in maintaining a leaderboard of players' scores using a max heap.

Input format :
The input consists of a series of space-separated integers, each representing the score of a player.

Output format :
The output displays the player scores on the leaderboard, positioning the player with the highest score at the top.

Code constraints :
The maximum number of players that can be displayed on the leaderboard is 100, as the max heap has a maximum capacity of 100.

Sample test cases :
Input 1 :
10 20 5 15 25
Output 1 :
25 20 5 10 15 
Input 2 :
30 12 18
Output 2 :
30 12 18 */
#include <iostream>
#include <vector>
#include <algorithm>

void insertScore(std::vector<int> &maxHeap, int score) {
    maxHeap.push_back(score);
    std::push_heap(maxHeap.begin(), maxHeap.end(), std::less<int>());
}

int main() {
    int maxSize = 100;
    std::vector<int> maxHeap;

    std::cout << "Enter player scores separated by spaces: ";
    int score;
    while (std::cin >> score) {
        insertScore(maxHeap, score);
        if (std::cin.get() == '\n') {
            break;
        }
    }

    std::make_heap(maxHeap.begin(), maxHeap.end(), std::less<int>());

    std::cout << "Leaderboard: ";
    for (int i : maxHeap) {
        std::cout << i << ' ';
    }
    std::cout << std::endl;

    return 0;
}
