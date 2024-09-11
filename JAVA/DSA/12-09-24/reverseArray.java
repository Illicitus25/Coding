public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // int arr1[]=new int[arr.length];
        // int c=0;
        // for(int i=arr.length-1;i>=0;i--){
        //     arr1[c]=arr[i];
        //     c++;
        // }
        // for(int i:arr1){
        //     System.out.print(i+" ");
        // }
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i:arr){
                System.out.print(i+" ");
            }
    }
}
