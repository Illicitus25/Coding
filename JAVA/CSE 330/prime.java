import java.util.*;
class prime{
    public static void main(String main[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
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