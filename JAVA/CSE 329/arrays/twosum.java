/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]*/
import java.util.Arrays;
public class twosum {
    public static void main(String args[]){
        int arr[]={1,4,10,2,5,9,7,2};
        int n=8;
        int target=4;
        boolean flag=false;
        Arrays.sort(arr); 
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("true");
                flag=true;
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
