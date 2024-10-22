
import java.util.Scanner;
public class coinChangedp {
    public static int minCoins(int[] coins, int n, int amount) {
        int[][] dp = new int[n + 1][amount + 1];
        int inf=amount+1;
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = inf;
        }
        
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= amount; j++) { 
               if(j<coins[i-1]){
                dp[i][j]=dp[i-1][j];
               }
               else{
                dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
               }
            }
        }

        return dp[n][amount] > amount ? -1 : dp[n][amount];
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Amount:");
            int n=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Denominations");
            String str=sc.nextLine();
            String input[]=str.split(" ");
            int arr[]=new int[input.length];
            for(int i=0;i<input.length;i++){
                arr[i]=Integer.parseInt(input[i]);
            }
            int result = minCoins(arr, arr.length, n);
            if (result == -1) {
                System.out.println("It's not possible to make the amount with the given coins.");
            } else {
                System.out.println("Minimum number of coins needed: " + result);
            }
    }
}
