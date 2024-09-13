public class dutchFlag {
    public static void main(String args[]){
        int arr[]={2,0,1,1,0,1};
        int left=0;
        int mid=0;
        int right=arr.length-1;
        printArray(arr);
        while(mid<=right){
            switch(arr[mid]){
                case 0:{
                     swap(left,mid,arr);
                     left++;
                     mid++;
                     break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    swap(mid,right,arr);
                    right--;
                    break;
                }
            }
        }
        printArray(arr);
    }
    public static void swap(int a,int b,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
