import java.util.*;
/*
 * if length of two strings are equal to each other and the characters in the first string occur
 * the same number of times as they do in string 2. String 1 is considered an anagram of String 2 or vice versa.
 * ex- String1- abc
 *     String2- cba
 */
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=sc.nextLine();
        System.out.println("Enter String 2");
        String s2=sc.nextLine();
        System.out.println("Method 1: O(n log n)");
        System.out.println("Method 2: O(n)");
        System.out.println("Enter Complexity choice:");
        int n=sc.nextInt();
        sc.close();
        //Method 1 O(n log n)
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
        }
        switch(n){
            case 1:
            char arr1[]=s1.toCharArray();
            Arrays.sort(arr1);
            char arr2[]=s2.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.toString(arr2).equals(Arrays.toString(arr1))){
                System.out.println("Anagram");
            }
            else{
                int c=0;
                System.out.println("Not anagram");
                
            }
            break;
            case 2:
        //Method 2 O(n)
            int arr[]=new int[26];
            for (int i = 0; i < s1.length(); i++) {
                arr[s1.charAt(i)-'a']++;
                arr[s2.charAt(i)-'a']--;
            }
            for(int i:arr){
                if(i!=0){
                System.out.println("Not anagram");
                return;
                }
            }
            System.out.println("Anagram");
            break;
        }
    }
}
