    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    class Stack{
        private Node top;
        Stack(){
            this.top=null;
        }
        public void push(int data) {
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
            System.out.println(data + " pushed onto stack.");
        }
        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty.");
                return -1;
            } else {
                int popped = top.data;
                top = top.next;
                System.out.println(popped + " popped from stack.");
                return popped;
            }
        }
        public void display() {
            if (top == null) {
                System.out.println("Stack is empty.");
            } else {
                Node current = top;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }
    public class StackUsingLinkedList {
        public static void main(String[] args) {
            Stack stack = new Stack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.pop();
            stack.push(5);
            stack.display();
        }
    }
