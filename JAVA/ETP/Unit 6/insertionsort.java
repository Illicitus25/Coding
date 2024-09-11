/*
arr=[12,11,13,5,6,7,3]
5,3
12,5,3
3,5,12
output=[3,11,13,5,6,7,12]
*/
public class insertionsort {
    void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i+=3){
            int key=arr[i];
            int j=i-3;
        while(j>=0 && arr[j]>key){
            arr[j+3]=arr[j];
            j=j-3;
        }
        arr[j+3]=key;
    }
    }
static void printArray(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
}
public static void main(String args[]){
    int arr[]={12,11,13,5,6,7,3};
    insertionsort ob=new insertionsort();
    ob.sort(arr);
    ob.printArray(arr);
}
}
