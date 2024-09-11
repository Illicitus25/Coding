import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class specialrmv {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        String s="";
        try{
        BufferedReader reader=new BufferedReader(new FileReader(filename));
        int character;
        while((character=reader.read())!=-1){
            char ch=(char)character;
            if(ch>='A'&& ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'||ch==' '||ch==','){
                s=s+ch;
            }
        }
        reader.close();
        System.out.println(s);
    }catch(Exception e){
        System.out.println("File not found");
    }
}
}