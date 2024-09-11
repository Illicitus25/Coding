public class checkkthbit {
    public static void main(String[] args) {
        System.out.println(checkKthBit(9, 1));
    }
    public static boolean checkKthBit(int n, int k)
    {
        int mask=1<<k;
        if((n%mask)!=0){
            return true;
        }
        return false;
    }
}
