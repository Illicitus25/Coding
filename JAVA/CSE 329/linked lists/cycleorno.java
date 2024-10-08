import java.util.HashSet;
public class cycleorno {
    Node head;
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        cycleorno list=new cycleorno();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.createCycle(6, 3);
        //METHOD 1: USING A HASHSET
        //System.out.println(list.detectCycle().data);
        //METHOD 2: USING A SLOW AND FAST POINTER
        System.out.println(list.checkCycle());
    }
    public Node checkCycle(){
        boolean cycle=false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return null;
        }
        fast=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public Node detectCycle() {
        HashSet<Node> visitedNodes = new HashSet<>();
        Node current = head;
        while (current != null) {
            if (visitedNodes.contains(current)) {
                return current;  
            }
            visitedNodes.add(current);
            current = current.next;
        }
        return null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void createCycle(int fromIndex, int toIndex) {
        Node fromNode = getNodeAt(fromIndex);
        Node toNode = getNodeAt(toIndex);

        if (fromNode != null && toNode != null) {
            fromNode.next = toNode; 
        }
    }

    private Node getNodeAt(int index) {
        Node current = head;
        int count = 1;
        
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        
        return current;
    }
}
