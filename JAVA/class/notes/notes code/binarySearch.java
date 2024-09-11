public class binarySearch{
    public static void main(String args[]){
        int arr[]={10,4,434,2,132,54,31};
        if(search(arr,54)==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index "+search(arr,54));
        }
    }
     public static int search(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}