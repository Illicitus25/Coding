class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class midstackusingll {
    Node top;
    Node middle;
    int size;

    public midstackusingll() {
        this.top=null;
        this.middle=null;
        this.size=0;
    }
    public void push(int data){
        Node newNode= new Node(data);
        if(top!=null){
            top.next=newNode;
            newNode.prev=top;
        }
        top=newNode;
        size++;
        if(size==1){
            middle=top;
        }
        else if(size%2!=0){
            middle=middle.next;
        }
    }
    public int pop(){
        if(top==null){
            System.out.println("Stack is empty.");
            return -1;
        }
        int poppedData=top.data;
        top=top.prev;
        size--;
        if(size%2==0){
            middle=middle.prev;
        }
        return poppedData;
    }
    public int getMiddle(){
        if(middle==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return middle.data;
    }
    public static void main(String args[]){
        midstackusingll stack= new midstackusingll();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.getMiddle());
        stack.pop();
        System.out.println(stack.getMiddle());
        stack.pop();
        System.out.println(stack.getMiddle());
        stack.pop();
        System.out.println(stack.getMiddle());
        stack.pop();
        System.out.println(stack.getMiddle());
        stack.pop();
        System.out.println(stack.getMiddle());
    }
}
