import java.util.*;
/*
 A pangram is a string that contains all the characters of the english alphabet i.e. a-z
 this program inputs a string and prints out the letters 
 that are missing from the string for it to be a pangram string.
 */
class pangram {
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

