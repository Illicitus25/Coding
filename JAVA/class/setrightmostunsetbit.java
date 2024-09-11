public class setrightmostunsetbit {
    public static void main(String[] args) {
        System.out.println(setBit(15));
    }
    public static int setBit(int n){
        String binary="0"+Integer.toBinaryString(n);
        int position=-1;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='0'){
                position=Math.abs(i-binary.length())-1;
                break;
            }
        }
        
            int mask=1<<position;
            return n|mask;
        
    }
}
