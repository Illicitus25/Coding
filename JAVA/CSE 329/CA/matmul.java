import java.util.Scanner;
public class matmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns for mat1:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter number of rows and columns for mat2:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat1[][]=new int[m][n];
        int mat2[][]=new int[r][c];
        if(n!=r){
            System.out.println("Please enter a size such that n==r");
            System.exit(0);
        }
        System.out.println("Enter Elements in mat1:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements in mat2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrices");
        printmat(mat1);
        printmat(mat2);
        System.out.println("Matrix after Multiplication:");
        printmat(mulmat(mat1,mat2));
    }
    public static int[][] mulmat(int mat1[][],int mat2[][]){
        int m=mat1.length;
        int p=mat2[0].length;
        int newmat[][]=new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                newmat[i][j]=0;
                for(int k=0;k<mat1[0].length;k++){
                    newmat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        return newmat;
    }
    public static void printmat(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
