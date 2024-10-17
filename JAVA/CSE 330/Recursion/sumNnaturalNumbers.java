public class sumNnaturalNumbers {
    public static int sum(int n,int s){
        if(n==0){
            return s;
        }
        s+=n;
        return sum(n-1,s);
    }
    public static int sum1(int n){
        if(n==1){
            return 1;
        }
        return n+sum1(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10,0));
    }
}
