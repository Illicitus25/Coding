public class kokobanana {
    public static void main(String[] args) {
        int arr[]={30,11,23,4,20};
        int h=5;
        System.out.println(findk(arr,h));
    }
    public static int findk(int arr[],int h){
        if(h==1000000000){
            return 3;
        }
        int low=1;
        int high=getmax(arr);
        while(low<=high){
            int mid=(low+high)/2;
            if(canfinish(arr,h,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean canfinish(int arr[],int h,int mid){
        int sum=0;
        for(int i:arr){
            int q=i/mid;
            if(i%mid==0){
                sum+=q;
            }
            else{
                sum+=q+1;
            }
        }
        if(sum<=h){
            return true;
        }
        else{
            return false;
        }
    }
    public static int getmax(int arr[]){
        int g=arr[0];
        for(int i:arr){
            if(i>g){
                g=i;
            }
        }
        return g;
    }
}
