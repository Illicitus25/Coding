import java.util.Scanner;
public class sieveOfErotesthenes {
    public static void main(String[] args) {
        System.out.println("Print all the prime numbers till?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=1;
                }
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]==0){
                System.out.print(i+" ");
            }
        }
    }
}
