public class freqgpt {
    public static void main(String[] args) {
        String inputString = "hello world";

        // Convert the string to an array of characters
        char[] characters = inputString.toCharArray();

        // Iterate through each character
        for (int i = 0; i < characters.length; i++) {
            // Initialize frequency to 0 for each character
            int frequency = 0;
            
            // Check if the character has already been counted
            boolean counted = false;
            
            // Iterate through the string to count the frequency of the current character
            for (int j = 0; j < characters.length; j++) {
                // If the character matches, increment the frequency
                if (characters[i] == characters[j]) {
                    frequency++;
                    
                    // Mark the character as counted to avoid recounting
                    if (i != j) {
                        counted = true;
                    }
                }
            }

            // If the character hasn't been counted already, print its frequency
            if (!counted) {
                System.out.println("'" + characters[i] + "' : " + frequency);
            }
        }
    }
}
