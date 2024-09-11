package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndWildcards {
    public static <T> void printArray(List<T> array){
        for(T item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void printArrayWildcards(List<?> array){
        for (Object element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] arg){
        List<Integer> intArray = List.of(1,2,3,4,5);
        List<String> strArray = List.of("apple","banana","hello");

        printArray(intArray);
        printArrayWildcards(intArray);

        printArray(strArray);
        printArrayWildcards(strArray);

        List<?> wildcardList = new ArrayList<>();
        wildcardList = intArray;
        wildcardList = strArray;

//        intArray = strArray;
    }
}
