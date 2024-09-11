package IOFundamentals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFiles {
    public static void main(String[] arg){
        String fileName = "examaple.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.err.println("Error : File not found");
        }
        catch (IOException e){
            System.err.println("Error : " + e.getMessage());
        }
    }
}
