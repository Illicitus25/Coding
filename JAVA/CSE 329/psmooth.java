import java.util.*;
public class psmooth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter p");
        int p=sc.nextInt();
        sc.close();
        int max=Integer.MIN_VALUE;
        while(n%2==0){
                max=2;
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                if(i>max){
                    max=i;
                }
                n=n/i;
            }
        }
        if(n>1){
            max=n;
        }
        if(max<=p){
            System.out.println("P-smooth");
        }
        else{
            System.out.println("Not P-smooth");
        }
    }
}
