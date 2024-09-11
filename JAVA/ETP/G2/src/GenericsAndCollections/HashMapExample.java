package GenericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] arg){
        Map<String,Integer> map = new HashMap<>();

        //Adding key-value pair
        map.put("key1",123);
        map.put("key2",456);
        map.put("key1",987);

        //Retrieving the values using keys
        Integer value1 = map.get("key1");
        Integer value2 = map.get("key2");

        System.out.println(value1 + " " + value2);

        System.out.println(map.containsKey("key3"));

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
