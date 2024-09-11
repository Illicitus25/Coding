import java.util.Arrays;
public class smallestdivisor {
    public static void main(String args[]){
        int arr[]={44,22,33,11,1};
        Arrays.sort(arr);
        int threshold=5;
        int low=1;
        int high=arr[arr.length-1];
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(result(arr,mid)<=threshold){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(res);
    }
    public static int result(int arr[],int mid){
        int sum=0;
        for(int i:arr){
            sum+=(int)Math.ceil((double)i/mid);
        }
        return sum;
    }
}
