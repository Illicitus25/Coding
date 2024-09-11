import java.util.*;
class binarysearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = { 2, 3, 4, 10, 40 };
        sc.close();
        binarysearch obj=new binarysearch();
        obj.search(arr,n);
    }
    public void search(int arr[],int n){
        int low=0;
        int floor =-1;
        int ceiling=-1;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==n){
                System.out.println("found at index "+mid);
                floor=arr[mid];
                ceiling=arr[mid];
                break;
            }
            else{
                if(n<arr[mid]){
                    high=mid-1;
                    ceiling=arr[mid];
                }
                else{
                    low=mid+1;
                    floor=arr[mid];
                }
            }
            }
        // System.out.println("not found");
        System.out.println("floor "+floor);
        System.out.println("ceiling "+ceiling);
    }
}