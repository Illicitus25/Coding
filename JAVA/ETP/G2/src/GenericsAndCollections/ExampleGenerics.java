package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class ExampleGenerics {

    static class Pair<T,U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first +
                    ", " + second + ")"
                    ;
        }
    }
    public static <T,U> List<Pair<T,U>> mergeArrays(T[] array1,U[] array2){
        if (array1.length != array2.length)
            throw new IllegalArgumentException("Arrays should be of same length");
        List<Pair<T,U>> mergedList = new ArrayList<>();
        for (int i = 0 ; i< array1.length ; i++)
            mergedList.add(new Pair<>(array1[i],array2[i]));
        return mergedList;
    }
    public static void main(String[] arg){
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"one","two","three","four","five"};

        List<Pair<Integer,String>> mergedArray = mergeArrays(intArray,strArray);
        System.out.println("Merged Array : " +  mergedArray);
    }
}
