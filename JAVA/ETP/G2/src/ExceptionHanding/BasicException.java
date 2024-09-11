package ExceptionHanding;

public class BasicException {
    public static void main(String[] arg){
       try {
          int x = 10;
          int y = 0;
          int res = x/y;
          System.out.println(res);
       }catch (ArithmeticException e){
           System.out.println("Caught Arithematic Exception : " + e.getMessage());
       }
    }
}
