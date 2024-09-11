public class linkedlist {
    Node head;
    int size;
    linkedlist(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add first,last
    public void addfirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addlast(int data){
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
    //print linked list
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    //delete first
    public void deletefirst(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node currNode=head;
        while(currNode.next.next!=null){
            currNode=currNode.next;
        }
        currNode.next=null;
    }
    public int getSize(){
        return size;
    }
    public int getsum(){
        int sum=0;
        int c=0;
        Node l1=head;
        while(l1!=null){
            sum=sum+(int)Math.pow(10,c)*l1.data;
            c++;
            l1=l1.next;
        }
        return sum;
    }
    public static void main(String args[]){
        linkedlist list =new linkedlist();
        // list.addfirst("a");
        // list.addfirst("is");
        // list.addfirst("this");
        // list.addlast("list");
        // list.printList();
        // System.out.println(list.getSize());
        // list.deletefirst();
        // list.printList();
        // System.out.println(list.getSize());
        // list.deletelast();
        // list.printList();
        // System.out.println(list.getSize());
        list.addlast(2);
        list.addlast(4);
        list.addlast(3);
System.out.println(list.getsum());
    }
}
