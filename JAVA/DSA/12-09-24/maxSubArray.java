

public class maxSubArray {
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        // Brute Force O(n^3)

        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int s=0;
        //         for(int k=i;k<=j;k++){
        //             s=s+arr[k];
        //         }
        //         if(s>maxSum){
        //             maxSum=s;
        //         }
        //     }
        // }
        // System.out.println(maxSum);

        //Optimized O(n^2)

        // int prefix[]=new int[n];
        // for(int i=0;i<n;i++){
        //     int s=0;
        //     for(int j=0;j<=i;j++){
        //         s+=arr[j];
        //     }
        //     prefix[i]=s;
        // }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     int start=i;
        //     for(int j=i;j<n;j++){
        //         int end=j;
        //          sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
        //     }
        // }
        // System.out.println(maxSum);

        // Kadane's Algorithm

        int currSum=0;
        for(int i=0;i<n;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
