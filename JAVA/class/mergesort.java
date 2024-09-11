public class mergesort {
    public static void main(String[] args) {
        int arr[]={};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
