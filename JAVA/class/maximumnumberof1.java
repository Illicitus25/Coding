public class maximumnumberof1 {
    public static void main(String[] args) {
        int arr[][]={{0,1},{1,0}};
        System.out.println(java.util.Arrays.toString(maximumone(arr)));
    }
    public static int[] maximumone(int arr[][]){
        int maxcount=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            int c=count(arr[i]);
            if(c>maxcount){
                maxcount=c;
                index=i;
            }
        }
        return new int[]{index,maxcount};
    }
    public static int count(int arr[]){
        int c=0;
        for(int i:arr){
            if(i==1){
                c++;
            }
        }
        return c;
    }
}
