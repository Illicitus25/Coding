import java.util.Scanner;
class arrays{
    //INSERTION
    public static int[] insertValue(int arr[],int insertVal,int insertIndex){
        int newArr[]=new int[arr.length+1];
        for(int i=0;i<insertIndex;i++){
            newArr[i]=arr[i];
        }
        newArr[insertIndex]=insertVal;
        for(int i=insertIndex;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
    //DELETION
    public static int[] deleteValue(int arr[],int deleteIndex){
        int newArr[]=new int[arr.length-1];
        for(int i=0;i<deleteIndex;i++){
            newArr[i]=arr[i];
        }
        for(int i=deleteIndex;i<arr.length-1;i++){
            newArr[i]=arr[i+1];
        }
        return newArr;
    }
    //TRAVERSE OR PRINT
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int n=sc.nextInt();
        //INITIALIZATION
        int arr[]=new int[n];
        System.out.println("Enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Enter the value to insert:");
        int insertVal=sc.nextInt();
        System.out.println("Enter the index to insert the value");
        int insertIndex=sc.nextInt();
        arr=insertValue(arr,insertVal,insertIndex);
        System.out.println("Array after Insertion:");
        printArray(arr);

        System.out.println("Enter the index to delete value from:");
        int deleteIndex=sc.nextInt();
        arr=deleteValue(arr,deleteIndex);
        System.out.println("Array after Deletion:");
        printArray(arr);
        sc.close();
    }
}