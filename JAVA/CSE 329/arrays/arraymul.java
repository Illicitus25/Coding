/*In this question, the problem statement is that given an array
 *                  [1,2,3,4]
 *              L=[1,1,2,6]
 *              R=[24,12,4,1]
 * we calculate the left product and right product of the elements to the left/right of that element
 * and store them in their respective arrays
*/

public class arraymul {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int l[]=new int[4];
        int r[]=new int[4];
        int c=0;
        for(int i=0;i<4;i++){
            int lp=1;
            int rp=1;
            for(int j=0;j<i;j++){
                lp*=arr[j];
            }
            for(int k=i+1;k<arr.length;k++){
                rp*=arr[k];
            }
            l[c]=lp;
            r[c]=rp;
            c++;
        }
        printArray(l);
        printArray(r);
    }
}
