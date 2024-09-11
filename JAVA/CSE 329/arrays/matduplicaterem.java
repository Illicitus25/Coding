/*
in this question given matrix
1 2 3 4 
5 2 1 4
2 1 3 5
1 3 2 4
we have to remove the elements that are present in each row,
in this case 1 and 2
*/
import java.util.*;
public class matduplicaterem {
    public static void printArray(ArrayList <Integer> list){
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println();   
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // Avoid printing uninitialized elements (0 in this case).
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,2,1,4},{2,1,3,5},{1,3,2,4}};

        //BruteForce O(n^3)

        // ArrayList <Integer> arr1=new ArrayList<>();
        // int c1=0;
        // for(int i=0;i<4;i++){
        //     int c=0;
        //     int element=arr[0][i];
        //     for(int j=1;j<4;j++){
        //         boolean flag=false;
        //         for(int k=0;k<4;k++){
        //             if(arr[j][k]==element){
        //                 c++;
        //                 flag=true;
        //                 break;
        //             }
        //         }
        //         if(flag==false){
        //             break;
        //         }
        //     }
        //     if(c==3){
        //         arr1.add(arr[0][i]);
        //         c1++;
        //     }
        // }
        // printArray(arr1);

        //Using HashSet O(n^2)
        
        HashSet<Integer> commonElements = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            commonElements.add(arr[0][i]);
        }
        for (int i = 1; i < 4; i++) {
            HashSet<Integer> rowElements = new HashSet<>();
            for (int j = 0; j < 4; j++) {
                rowElements.add(arr[i][j]);
            }
            commonElements.retainAll(rowElements);
        }
        int[] result = new int[commonElements.size()];
        int index = 0;
        for (int elem : commonElements) {
            result[index++] = elem;
        }
        printArray(result);

    /*The issue with this approach is that when used with an example say
     * 1 2 3 1 
     * 4 3 1 0
     * 1 5 1 0
     * 1 1 8 3
     * the answer set will be [1] which will remove all the '1' in the matrix which is not what we want,
     * we only want to remove one '1' from each row and it is not possible to have multiple '1' in a hashset
     */
    
    //Using HashMap
    }
}
