package FunctionalInterface;

@FunctionalInterface
interface BinaryOperation {
    double operate(double a, double b);
}

public class DifferentImplementationsOfFunctionalInterface {
    public static void main(String arg[]){
        BinaryOperation add = (a,b) -> a+b;
        BinaryOperation sub = (a,b) -> a-b;
        BinaryOperation multiply = (a,b) -> a*b;
        BinaryOperation divide = (a,b) -> {
            if (b==0){
                throw new ArithmeticException("Division by zero is not possible");
            }
            return a/b;
        };
        System.out.println(add.operate(5,3));
        System.out.println(sub.operate(5,3));
        System.out.println(multiply.operate(5,3));
        System.out.println(divide.operate(5,3));
    }
}
