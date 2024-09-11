class rotatearray{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=5;
        int k=3;
        int arr1[]=new int[n];
        int c=0;
        for(int i=n-k;i<n;i++){
            arr1[c]=arr[i];
            c++;
        }
        for(int i=0;i<=n-k-1;i++){
            arr1[c]=arr[i];
            c++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]);
        }
    }
}