#include <iostream>
using namespace std;
#define MAX_HEAP_SIZE 100
int heap[MAX_HEAP_SIZE];
int heapSize=0;

void maxHeap(int index){
    while(index>0 &&heap[index]>heap[(index-1)/2]){
        swap(heap[index],heap[(index-1)/2]);
    index=(index-1)/2;
}
}
void insert(int value){
    if(heapSize >= MAX_HEAP_SIZE){
        cout<<"Heap is full.Cannot insert.\n";
        return;
    }
    heap[heapSize]=value;
    maxHeap(heapSize);
    heapSize++;
}
void heapify(int index){
    int leftChild= 2*index+1;
    int rightChild=2*index+2;
    int largest=index;
    if(leftChild<heapSize && heap[leftChild]>heap[largest]){
        largest=leftChild;
    }
    if(rightChild < heapSize && heap[rightChild]>heap[largest]){
        largest=rightChild;
    }
    if(largest!=index){
        swap(heap[index],heap[largest]);
        heapify(largest);
    }
}
int deleteMax(){
    if(heapSize==0){
        cout<<"Heap is emty.Cannot delete.\n";
        return -1;
    }
    int deletedvalue=heap[0];
    heap[0]=heap[heapSize-1];
    heapSize--;
    heapify(0);
    return deletedvalue;
}
int main(){
    int count,data;
    cout<<"Enter count: ";
    cin>>count;
    for(int i=0;i<count;i++){
        cout<<heap[i]<<" ";
    }
    cout<<endl;
    int max=deleteMax();
    cout<<"Deleted max element:"<<max;
    cout<<endl;
    cout<<"Max heap after deletion:";
    for(int i=0;i<heapSize;i++){
        cout<<heap[i]<<" ";
    }
    return 0;
}
