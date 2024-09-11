import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class strbldr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        String word=sc.nextLine();
        try{
        BufferedReader reader=new BufferedReader(new FileReader(filename));
        String line;
        boolean flag=false;
        String ans="";
        while((line=reader.readLine())!=null){
            if(line.contains(word)){
                flag=true;
            ans=ans+line.replace(word,"")+"\n";
            }
        }
        reader.close();
        if(flag==true)
        System.out.println(ans);
        else
        throw new Exception();

    }
    catch(Exception e){
        System.out.println("Word not found");
    }
        sc.close();
    }
}
