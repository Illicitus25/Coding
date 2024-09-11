import java.util.*;
import java.io.*;
public class file {
    public static void main(String args[]){
        //Creating a new File
        File myFile = new File("shaliniji.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Writing to a File
        try {
            FileWriter fw = new FileWriter("shaliniji.txt");
            fw.write("I have the best girlfriend in the world!");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        //Reading from a File
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //Deleting a File
        if(myFile.delete()){
            System.out.println("deleted file: " + myFile.getName());
        }
        else{
            System.out.println("file could not be deleted");
        }
    }
}
