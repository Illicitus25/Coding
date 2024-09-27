import java.util.*;
public class remforanagram {
    public static int minCharactersToRemove(String str1, String str2) {
        // Step 1: Count frequency of each character in both strings
        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
        }

        // Step 2: Calculate the number of characters to remove
        int removals = 0;

        // Count removals for characters in str1
        for (char c : frequencyMap1.keySet()) {
            if (frequencyMap2.containsKey(c)) {
                // If the character is present in both, calculate the excess
                removals += Math.abs(frequencyMap1.get(c) - frequencyMap2.get(c));
            } else {
                // If the character is only in str1, add its count to removals
                removals += frequencyMap1.get(c);
            }
        }

        // Count removals for characters in str2 that are not in str1
        for (char c : frequencyMap2.keySet()) {
            if (!frequencyMap1.containsKey(c)) {
                removals += frequencyMap2.get(c);
            }
        }

        return removals;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abcd";
        int result = minCharactersToRemove(str1, str2);
        System.out.println("Minimum characters to remove: " + result);
    }
}
