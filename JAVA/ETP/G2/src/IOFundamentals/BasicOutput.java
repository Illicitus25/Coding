package IOFundamentals;

import java.util.IllegalFormatConversionException;

public class BasicOutput {
    public static void main(String arg[]){
        int num = 10;
        System.out.println("The value of the num is : " + num);

        int value = 23;
        try {
            System.out.printf("Formatted value : %.2f%n", value);
        }catch (IllegalFormatConversionException e ){
            System.out.println("Error : Format specifier and argument type mismatch");
        }
        System.err.println("This is an error message");
    }
}
