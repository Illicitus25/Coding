
import java.util.LinkedList;

public class reverseLL {
    public static void main(String args[]){
        LinkedList<Integer> list= new LinkedList<>();
        LinkedList<Integer> list1= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int l=list.size()/2;
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        while(!list.isEmpty()){
        list1.add(list.getLast());
        list.removeLast();
        }
        System.out.println();
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+"->");
        }
    }
}
