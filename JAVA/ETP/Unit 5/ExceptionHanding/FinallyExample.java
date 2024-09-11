package ExceptionHanding;

import java.util.Scanner;

public class FinallyExample {
    private static double divide(int dividend, int divisor) throws ArithmeticException, IllegalArgumentException{
        if(divisor==0)
            throw new ArithmeticException("Division by zero not possile");
        if (dividend < 0 || divisor < 0)
            throw new IllegalArgumentException("Both Dividend and Divisor has to be positive");
        return dividend/divisor;
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter the dividend : ");
            int dividend = scanner.nextInt();
            System.out.println("Enter the divisor : ");
            int divisor = scanner.nextInt();
            double res = divide(dividend,divisor);
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println("Arithematic Error : " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgument Error : " + e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Scanner is closed");
        }

    }
}
