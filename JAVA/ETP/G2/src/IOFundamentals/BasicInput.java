package IOFundamentals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter input : ");
            String num = scanner.nextLine();
            System.out.println("Entered input : " + num);
        }catch (InputMismatchException e){
            System.out.println("Invalid input!");
        }
    }
}
