//here we pass an entire sorted row to a function which returns the index where the value is present if not returns -1
public class searchmat {
    public static void main(String[] args) {
        int index=-1;
        int row=-1;
        searchmat obj=new searchmat();
        int arr[][]={{1,2,3},{4,5,6},{8,9,10}};
        int n=11;
        for(int i=0;i<3;i++){
            index=obj.search(arr[i], n);
            if(index!=-1){
                row=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("found at index "+row+" "+index);
        }
    }
    public int search(int arr[],int n){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==n){
                return mid;
            }
            else{
                if(n<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            }
            return -1;
    }
}
