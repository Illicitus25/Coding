import java.util.Arrays;
public class containsDuplicate {
    public static void main(String[] args) {
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        Arrays.sort(nums);
        boolean flag=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Contains Duplicate");
        }
        else{
            System.out.println("Does not contain Duplicate");
        }
    }
}
