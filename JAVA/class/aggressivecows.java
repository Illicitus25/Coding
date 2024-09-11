import java.util.Arrays;
public class aggressivecows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;
        
        int result = findLargestMinDistance(stalls, cows);
        System.out.println("The largest minimum distance is: " + result);
    }
    public static int findLargestMinDistance(int stalls[],int cows){
        Arrays.sort(stalls);
        int low=1;
        int result=0;
        int high=stalls[stalls.length-1]-stalls[0];
        while(low<=high){
        int mid=low+(high-low)/2;
        if(canfitcows(stalls,cows,mid)){
            result=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        }
        return result;
    }
    public static boolean canfitcows(int []stalls,int cows,int mid){
        int count=1;
        int position=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-position>=mid){
                count++;
                position=stalls[i];
                if(count==cows){
                    return true;
                }
            }
        }
        return false;
    }
}