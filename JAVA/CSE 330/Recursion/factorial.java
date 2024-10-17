public class factorial {
    public static int fact(int n,int f){
        if(n==1){
            return f;
        }
        f=f*n;
        return fact(n-1,f);
    }
    public static int fact1(int n){
        if(n==1){
            return 1;
        }
        return n*fact1(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact1(4));
    }
}
