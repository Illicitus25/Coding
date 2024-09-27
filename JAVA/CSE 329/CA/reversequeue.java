import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class reversequeue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Dequeue all elements from the queue and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
