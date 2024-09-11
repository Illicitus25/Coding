package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class CollectionwithGeneric {
    public static void main(String[] arg){
        // Creating collections without generics
        List list = new ArrayList();
        list.add("Apple");
        list.add(10);
        list.add(true);

        String fruit = (String) list.get(0);
        Integer number = (Integer) list.get(1);
        Boolean flag = (Boolean) list.get(2);

        // Create collections with generics
        List<String> stringList = new ArrayList<>();
        stringList.add("String");
        // stringList.add(10); // not allowed

    }
}
