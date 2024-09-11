package ExceptionHanding;

public class ThrowExample {

    private static double customDivide(int dividend, int divisor) throws ArithmeticException, IllegalArgumentException{
        if(divisor==0)
            throw new ArithmeticException("Division by zero not possile");
        if (dividend < 0 || divisor < 0)
            throw new IllegalArgumentException("Both Dividend and Divisor has to be positive");
        return dividend/divisor;
    }

    public static void main(String[] arg){
        try
        {
            int dividend = -23;
            int divisor = 0;
            double result =  customDivide(dividend,divisor);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Arithematic Error : " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgument Error : " + e.getMessage());
        }
    }
}
