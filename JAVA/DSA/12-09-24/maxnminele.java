public class maxnminele{
    public static void main(String args[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]={4, 9, 6, 5, 2, 3 };
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}