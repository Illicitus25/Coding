import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class filehandling{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        try{
            //object objectname= new object(new FileReader());
        BufferedReader reader=new BufferedReader(new FileReader(filename));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line.toUpperCase());
        }
        reader.close();
        }
        catch(Exception e){
            System.out.println("File not Found");
        }
        sc.close();
    }
}
