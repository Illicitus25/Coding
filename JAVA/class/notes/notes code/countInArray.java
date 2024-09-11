public class countInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        int a=firstOccurence(arr,x);
        int b=LastOccurence(arr,x);
        System.out.println("Number of "+x+" in array is "+(b-a+1));
    }
    public static int firstOccurence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                high=mid-1;
            }
            else if(x<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int LastOccurence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            }
            else if(x<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
