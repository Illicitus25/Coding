import java.util.*;

public class menuDrivenSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Array (space-separated):");
        String str = sc.nextLine();
        String[] astr = str.split(" ");
        int[] arr = new int[astr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(astr[i]);
        }

        System.out.println("Enter 1 for Quick Sort");
        System.out.println("Enter 2 for Merge Sort");
        System.out.println("Enter your choice:");
        int c = sc.nextInt();

        if (c == 1) {
            System.out.println("Sorting using Quick Sort...");
            quickSort(arr, 0, arr.length - 1);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Complexity of QuickSort Algorithm:\n" +
                    "Worst Case: O(n^2)\n" +
                    "Average Case: O(n log n)\n" +
                    "Best Case: O(n log n)");
        } else if (c == 2) {
            System.out.println("Sorting using Merge Sort...");
            mergeSort(arr, 0, arr.length - 1);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Complexity of MergeSort Algorithm:\n" +
                    "Worst Case: O(n log n)\n" +
                    "Average Case: O(n log n)\n" +
                    "Best Case: O(n log n)");
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pi=partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=(low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
