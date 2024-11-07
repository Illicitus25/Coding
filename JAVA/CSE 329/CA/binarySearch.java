public class binarySearch {
    public static int binarySearchIterative(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int arr[],int target,int low,int high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearchRecursive(arr, target, low, mid-1);
        }
        else if(arr[mid]<target){
            return binarySearchRecursive(arr, target, mid+1, high);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10};
        int target=10;
        //System.out.println(binarySearchIterative(arr,target));
        System.out.println(binarySearchRecursive(arr, target, 0, arr.length-1));
    }
}
