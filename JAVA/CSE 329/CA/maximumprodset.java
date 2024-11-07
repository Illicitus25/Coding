public class maximumprodset {
    public static int findmin(int arr[]){
        int n = arr.length;
        int countNeg = 0, countPos = 0, countZero = 0;
        int maxNeg = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        int product = 1;
        for(int num:arr){
            if(num>0){
                countPos++;
                product*=num;
                minPos=Math.min(minPos,num);
            }
            else if(num<0){
                countNeg++;
                product*=num;
                maxNeg=Math.max(maxNeg,num);
            }
            else{
                countZero++;
            }
        }
        if(countNeg==0 && countPos==0){
            return 0;
        }
        if(countPos==0 && countZero>0){
            return 0;
        }
        if(countNeg%2!=0){
            return product/=maxNeg;
        }
        return product;
    }
    public static void main(String args[]){
        int arr[]= {0, 0, 0, -5};
        System.out.println(findmin(arr));
    }
}
