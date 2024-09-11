import java.util.*;
class primepairs{
    public static void main(String main[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        printPrimePairs(n);
    }
    public static void printPrimePairs(int n){
        for(int i=2;i<=n/2;i++){
            if(isPrime(i)&& n%i==0){
                int j=n/i;
                if(isPrime(j)&& i>=j){
                    System.out.print("("+i+","+j+") ");
                }
            }
        }
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
}