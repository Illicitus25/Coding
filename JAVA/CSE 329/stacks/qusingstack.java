import java.util.Stack;

class qusingstack<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public qusingstack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T element) {
        stack1.push(element);
    }

    public T dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        
        return stack2.pop();
    }

    public T peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        qusingstack<Integer> queue = new qusingstack<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.peek());     // Output: 2
        System.out.println(queue.dequeue());  // Output: 2
        System.out.println(queue.isEmpty());  // Output: false
        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.isEmpty());  // Output: true
    }
}
