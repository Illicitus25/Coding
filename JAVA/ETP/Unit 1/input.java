import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Input a number and check weather the number is magical or not 
        // if the sum of the digits of a number is equal to the product of digits of a number then the number is called magical number
        int n=sc.nextInt();
        int d=n;
        int s=0;
        int p=1;
        int s1=0;
        while(n>0){
            int r=n%10;
            s=s+r;
            p=p*r;
            s1=s1*10+r;
            n=n/10;
        }
        if(s==p){
            System.out.println(d+" is a magical number");
        }
        else{
            System.out.println(d+" ki mkc");
        }
        sc.close();
    }
}
