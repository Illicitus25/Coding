
import java.util.Scanner;

public class upperandlowertriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printmat(arr);
        System.out.println("Lower Triangle:");
        printmat(lowerTriangle(arr));
        System.out.println("Upper Triangle:");
        printmat(upperTriangle(arr));
    }
    //  LOWER TRIANGLE
    public static int[][] lowerTriangle(int arr[][]){
        int newarr[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i<j){
                    newarr[i][j]=0;
                }
                else{
                    newarr[i][j]=arr[i][j];
                }
            }
        }
        return newarr;
    }
    //  UPPER TRIANGLE
    public static int[][] upperTriangle(int arr[][]){
        int newarr[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i>j){
                    newarr[i][j]=0;
                }
                else{
                    newarr[i][j]=arr[i][j];
                }
            }
        }
        return newarr;
    }
    public static void printmat(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
