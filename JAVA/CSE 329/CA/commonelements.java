import java.util.HashSet;
import java.util.Set;
public class commonelements {
    public static Set<Integer> findCommonElements(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize a set with the elements of the first row
        Set<Integer> commonElements = new HashSet<>();
        for (int j = 0; j < cols; j++) {
            commonElements.add(matrix[0][j]);
        }

        // Traverse through the remaining rows
        for (int i = 1; i < rows; i++) {
            // Create a temporary set to store elements of the current row
            Set<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                rowSet.add(matrix[i][j]);
            }

            // Retain only elements that are common between the current row and the common elements set
            commonElements.retainAll(rowSet);
        }

        return commonElements;
    }

    // Method to display the common elements
    public static void displayCommonElements(Set<Integer> commonElements) {
        if (commonElements.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements across all rows:");
            for (int elem : commonElements) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {2, 3, 5, 7, 8},
            {2, 5, 9, 3, 6},
            {5, 2, 3, 4, 8}
        };

        // Find common elements
        Set<Integer> commonElements = findCommonElements(matrix);

        // Display the common elements
        displayCommonElements(commonElements);
    }

}
