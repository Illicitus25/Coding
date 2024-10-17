public class xpowern {
    public static int calc(int x,int n){ //stack height n
        if(n==1){
            return x;
        }
        return x*calc(x, n-1);
    }
    public static int calc1(int x,int n){ // stack height log(n)
        if(n==1){
            return x;
        }
        if(n%2==0){
            return calc1(x,n/2)*calc(x,n/2);
        }
        else {
        return x*calc1(x,n/2)*calc(x,n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(calc1(2,4));
    }
}
