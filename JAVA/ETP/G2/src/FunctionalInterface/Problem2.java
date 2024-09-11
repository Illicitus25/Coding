package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String aarg[]){
        List<String> words = Arrays.asList("apple","banana","orange","grape","pineapple");
        String substring = "ap";

        List<String> filteredWords = words.stream()
                .filter(word -> word.contains(substring))
                .collect(Collectors.toList());

        String concatenatedString = filteredWords.stream()
                .collect(Collectors.joining(" "));

        System.out.println(concatenatedString);
    }
}
