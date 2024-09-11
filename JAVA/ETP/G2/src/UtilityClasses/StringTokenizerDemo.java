package UtilityClasses;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] arg){
        StringTokenizer stringTokenizer = new StringTokenizer("Welcome to Java Programming!");
        System.out.println("Number of Tokens : " + stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()){
            System.out.println("Next Token is : " + stringTokenizer.nextToken());
        }

    }
}
