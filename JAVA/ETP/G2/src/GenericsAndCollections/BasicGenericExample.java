package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <E> void printArray(E[] array){
        for(E item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
public class BasicGenericExample {
    public static void main(String[] arg){
        // Create a box of Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Interger value : " + intBox.getValue());

        // Create a box of String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("hello");
        System.out.println("String Value : " + stringBox.getValue());

        // Defining and printing a integer array
        Integer[] intArray = {1,2,3,4,5};
        System.out.print("Integer Array : ");
        Box.printArray(intArray);

        // Defining and printing a string array
        String[] strArray = {"hello","apple","world"};
        System.out.print("String Array : ");
        Box.printArray(strArray);
    }
}
