import java.util.*;
class arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(0));
        //add el in between
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(0,5);
        System.out.println(list);
        //remove
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        //sorting
        Collections.sort(list);
        System.out.println();
        System.out.println(list);
    }
}