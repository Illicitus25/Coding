/*
 * Given two arrays of equal size, find the minimum sum of the product of corresponding elements in the arrays. The product sum is calculated as:
 * a1*b1+a2*b2.......
 * Input:
*Two arrays of integers, arr1[] and arr2[], both of size n.
*Output:
*The minimum sum of the product of the corresponding elements.
*Sort arr1[] in ascending order.
*Sort arr2[] in descending order.
*Multiply corresponding elements from the two sorted arrays and accumulate the sum.
*/
import java.util.Arrays;
public class minimumSum2arr {
    public static void main(String[] args) {
        int arr1[]={p};
        int arr2[]={5, 4, 4};
        int arr3[]=new int[arr1.length];
        int s=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int c=0;
        for(int i=arr2.length-1;i>=0;i--){
            arr3[c]=arr2[i];
            c++;
        }
        for(int i=0;i<arr1.length;i++){
            s+=arr1[i]*arr3[i];
        }
        System.out.println(s);
    }
}
