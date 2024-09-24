import java.util.Scanner;
import java.util.Stack;
public class minInStack {
    public static void main(String args[]){
        Stack<Integer> arr=new Stack<>();
        Stack<Integer> minarr=new Stack<>();
        int min=Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter an element (or 'q' to quit): ");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("q")){
                break;
            }
            if(Integer.parseInt(input)<min){
                min=Integer.parseInt(input);
                arr.push(min);
                minarr.push(min);
            }
            else{
            arr.push(Integer.parseInt(input));
            minarr.push(min);
            }
        }
        while(!arr.isEmpty()){
            System.out.println(arr.pop()+"\t\t\t"+minarr.pop());
        }
    }
}
