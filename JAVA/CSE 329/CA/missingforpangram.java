import java.util.Scanner;

public class missingforpangram {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        boolean arr[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            int index=(int)s.charAt(i)-97;
            arr[index]=true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                System.out.print((char)(i+97)+" ");
            }
        }
        sc.close();
    }
}
