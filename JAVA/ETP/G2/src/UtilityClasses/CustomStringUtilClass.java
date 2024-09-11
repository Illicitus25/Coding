package UtilityClasses;

class StringUtils{
    private StringUtils(){};

    public static String capitalizeFirstLetter(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static String reverseString(String str){
        if(str == null)
            return  str;

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

class NameFormatter{
    public void formatAndPrintName(String name){
        String formattedName = StringUtils.capitalizeFirstLetter(name);
        System.out.println("Formated String : " + formattedName);
    }
}

class PalindromeChecker{
    public void checkPalindrome(String word){
        String reversedWord = StringUtils.reverseString(word);
        if(word.equals(reversedWord)){
            System.out.println("This is a Palindrome");
        }
        else{
            System.out.println("This is not a Palindrome");
        }
    }
}
public class CustomStringUtilClass {
    public static void main(String[] arg){
        NameFormatter nameFormatter = new NameFormatter();
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        nameFormatter.formatAndPrintName("john");

        palindromeChecker.checkPalindrome("level");
        palindromeChecker.checkPalindrome("hello");
    }
}
