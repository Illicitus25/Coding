public class gcd {
    public static int getGCD(int a,int b){
        int m=Math.min(a,b);
        int max=1;
        for(int i=1;i<=m;i++){
            if(a%i==0 && b%i==0){
                max=i;
            }
        }
        return max;
    }
    public static int euclidean(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int[] extendedEuclidean(int a, int b) {
        if (b == 0) {
            return new int[]{a, 1, 0};
        }

        int[] result = extendedEuclidean(b, a % b);
        int gcd = result[0];
        int x1 = result[1];
        int y1 = result[2];

        int x = y1;
        int y = x1 - (a / b) * y1;

        return new int[]{gcd, x, y};
    }
    public static void main(String[] args) {
        int a=56;
        int b=98;
        //System.out.println(getGCD(5,10));
        int arr[]=extendedEuclidean(a, b);
        System.out.printf("%d.%d + %d.%d = %d",a,arr[1],b,arr[2],arr[0]);
    }
}
