package IOFundamentals;

import java.io.*;
import java.util.Scanner;

public class Example1 {
    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1 ; i>=0 ; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);



        BufferedReader reader = null;
        BufferedWriter writer = null;

        try{
            System.out.println("Enter the input filename : ");
            String inputFilename = scanner.nextLine();
            System.out.println("Enter the output filename : ");
            String outputFilename = scanner.nextLine();

            reader = new BufferedReader(new FileReader(inputFilename));
            writer = new BufferedWriter(new FileWriter(outputFilename));

            String line;
            while ((line = reader.readLine()) != null){
                String modifiedLine = line.toUpperCase();
                modifiedLine = reverseString(modifiedLine);
                System.out.println(modifiedLine);
                writer.write(modifiedLine);
                writer.newLine();
            }
        }catch (IOException e ){
            System.out.println("Error :" + e.getMessage());
        }finally {
            scanner.close();
            try{
                if(reader!=null)
                    reader.close();
                if(writer!=null)
                    writer.close();
            }catch (IOException e){
                System.err.println("Error is closing the file");
            }
        }

    }
}
