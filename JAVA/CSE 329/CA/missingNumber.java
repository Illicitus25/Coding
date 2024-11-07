public class missingNumber {
    public static int findMissingNumber(int arr[],int n){
        int sum=(n*(n+1))/2;
        for(int i:arr){
            sum-=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={3, 7, 1, 2, 8, 4, 5};
        int n= arr.length;
        System.out.println(findMissingNumber(arr,n+1));
    }
}
