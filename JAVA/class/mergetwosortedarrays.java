public class mergetwosortedarrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={6,7,8,9,10};
        int merged[]=merge(arr,arr1);
        for(int i:merged){
            System.out.print(i+" ");
        }
    }
    public static int[] merge(int arr[],int arr1[]){
        int arr2[]=new int[arr.length+arr1.length];
        int i=0,j=0,c=0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]<=arr1[j]){
                arr2[c++]=arr[i++];
            }
            else{
                arr2[c++]=arr1[j++];
            }
        }
        while(i<arr.length){
            arr2[c++]=arr[i++];
        }
        while(j<arr1.length){
            arr2[c++]=arr1[j++];
        }
        return arr2;
    }
}
