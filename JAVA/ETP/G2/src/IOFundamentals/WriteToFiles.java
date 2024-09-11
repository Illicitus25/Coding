package IOFundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFiles {
    public static void main(String[] arg){
        String filename = "src/IOFundamentals/output.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write("This is line 1");
            writer.newLine();
            writer.write("This is line 2");
        } catch (IOException e) {
            System.err.println("Error in writing to the file : " + e.getMessage());
        }
    }
}
