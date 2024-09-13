import java.util.Scanner;
public class fermat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=(int)Math.ceil(Math.sqrt(n));
        int y=(int)Math.sqrt(((x*x)-n));
        while(y!=Math.floor(y)){
            x++;
            y=(int)Math.sqrt(((x*x)-n));
        }
    int factor1=x-y;
    int factor2=x+y;
    System.out.println("Factors of "+n+" are "+factor1+" and "+factor2);
    }
}
