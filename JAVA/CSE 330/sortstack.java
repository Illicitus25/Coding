public class sortstack {
    int[] stack = new int[100];
    int top = -1;

    public static void main(String args[]) {
        sortstack obj = new sortstack();
        obj.push(30);
        obj.push(10);
        obj.push(20);
        System.out.println("Original Stack:");
        obj.printStack();
        obj.sort();
        System.out.println("Sorted Stack:");
        obj.printStack();
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == 99;
    }

    void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
    }

    int pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        System.out.println("Stack Underflow");
        return -1;
    }

    int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }

    void insertSorted(int element) {
        if (isEmpty() || peek() <= element) {
            push(element);
            return;
        }
        int temp = pop();
        insertSorted(element);
        push(temp);
    }

    void sort() {
        if (isEmpty()) {
            return;
        }
        int temp = pop();
        sort();
        insertSorted(temp);
    }

    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
