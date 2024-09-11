import java.util.*;
class sumOfPrime{
    public static void main(String main[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        primeSum(n);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
            }
        if(n>1 && n<=3){
        return true;
        }
        if(n%2==0 ||n%3==0){
        return false;
        }
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void primeSum(int n){
        for(int i=n;i>1;i--){
            if(isPrime(i)){
                int b=n-i;
                if(isPrime(b)){
                    System.out.println(i+"+"+b);
                    return;
                }
            }
        }
    }
}