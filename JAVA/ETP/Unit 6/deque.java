import java.util.*;

public class deque {
    public static void main(String args[]){
        Deque<Integer> dq= new ArrayDeque<>();
        dq.offerFirst(5);
        dq.offerLast(10);
        dq.offerLast(15);
        dq.offerFirst(20);
        dq.pollLast();
        dq.peekFirst();
        // for(int i=0;i < dq.size();i++){
        //     System.out.println(dq.get(i));
        // }
        dq.get(0);
        for(int a : dq){
          System.out.println(a);
        }
    }
}
