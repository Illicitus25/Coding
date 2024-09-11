public class FindSmallestElement {

    public static int findSmallestElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Check if the array is not rotated (already sorted)
        if (arr[left] <= arr[right]) {
            return arr[left];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid itself is the minimum element
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }

            // Check if the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // The smallest element is in the left half
                right = mid - 1;
            }
        }

        // Return left element after exiting loop
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int smallestElement = findSmallestElement(arr);
        System.out.println("The smallest element is: " + smallestElement);
    }
}
