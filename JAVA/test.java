import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        File myFile= new File("bubba.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedWriter bw= new BufferedWriter(new FileWriter("bubba.txt"))){
            bw.write("I love shalini tigga");
            bw.write("\nI love shalini tigga a lot");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        String line;
        try(BufferedReader br= new BufferedReader(new FileReader("bubba.txt"))){
            System.out.println(br.readLine().toUpperCase());
            System.out.println(br.readLine().toLowerCase());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        myFile.delete();
    }
}
