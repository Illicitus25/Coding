public class floorAndCeil {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        int x = 5;

        int floor = findFloor(arr, n, x);
        int ceil = findCeil(arr, n, x);

        System.out.println("Floor of " + x + " is: " + floor);
        System.out.println("Ceil of " + x + " is: " + ceil);
    }
    public static int findFloor(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(x>=arr[mid]){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int findCeil(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(x<=arr[mid]){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    } 
}
