public class missinginarray {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,5};
        System.out.println(missingnumber(arr, n));
    }
    public static int missingnumber(int arr[],int n){
        int xor=0;
        int xorr=0;
        for(int i:arr){
            xor=xor^i;
        }
        for(int i=0;i<=n;i++){
            xorr=xorr^i;
        }
        return (xor^xorr);
    }
}
