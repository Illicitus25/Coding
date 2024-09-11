import java.util.*;
public class hashmap {
    public static void main(String args[]){
        HashMap <String,Integer> map=new HashMap<>();
        //insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        // if key exists value is updated
        //if key does not exist it is inserted
        //SEARCHING
        System.out.println(map.containsKey("China"));
        System.out.println(map.get("China"));
        //iteration
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
