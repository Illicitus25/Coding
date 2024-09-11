import java.util.*;
class sieveoferatothenes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        boolean arr[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
            for (int j = 2; j <= n; j++) {
                if (arr[j] == true)
                    System.out.print(j + " ");
            }
    }
}