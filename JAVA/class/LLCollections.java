import java.util.*;
public class LLCollections {
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("this");
        list.add("is");
        list.add("a");
        list.add("linked");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.err.print(list.get(i)+"->");
        }
        list.removeFirst();
        list.removeLast();
        System.out.println("\n"+list);
        list.addFirst("this");
        list.add("list");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

    }
}
