import java.util.Scanner;
import java.util.Stack;

public class minInStack2 {
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        int min=Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter an element (or 'q' to quit) (or 'p' to pop): ");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("q")){
                break;
            }
            if(input.equalsIgnoreCase("p")){
                if(stack.peek()==min){
                    stack.pop();
                    min=stack.pop();
                }
                else{
                    stack.pop();
                }
                continue;
            }
            int value=Integer.parseInt(input);
            if(value<min){
                stack.push(min);
                min=value;
                stack.push(min);
            }
            else{
                stack.push(value);
            }
            }
            if(stack.isEmpty()){
                System.out.println("Empty Stack");
            }
            else{
            System.out.println("Minimum: "+stack.peek()+" \n\n\n");
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }
    }
}
