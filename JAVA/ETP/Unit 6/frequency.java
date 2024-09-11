import java.util.*;
public class frequency {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char arr[]=s.toCharArray();
    for(int i=0;i<arr.length;i++){
        int f=0;
        boolean counted=false;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                f++;
            
            if(i!=j){
                counted=true;
            }
        }
        }
        if(!counted)
        System.out.println(arr[i]+" "+f);
    }
    sc.close();
    }
}
