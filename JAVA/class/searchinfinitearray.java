public class searchinfinitearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 15;
        int index=findrange(arr,target);
        System.out.println(index);
    }
    public static int findrange(int arr[],int target){
        int low=0;
        int high=1;
        while(target>arr[high]){
            low=high;
            high=2*high;
        }
        return binarysearch(arr,low,high,target);
        }
    public static int binarysearch(int arr[],int low,int high,int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else{
                if(target>arr[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
