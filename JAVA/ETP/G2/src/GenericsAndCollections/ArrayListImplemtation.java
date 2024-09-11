package GenericsAndCollections;

import java.util.Arrays;

class MyArrayList<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList(){
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size(){
        return size;
    }

    public void add(E element){
        ensureCapacity();
        array[size++] = element;
    }

    public E get(int index){
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is greater than the size");
        }
        return (E) array[index];
    }

    public void ensureCapacity(){
        if(size == array.length){
            int newCapacity = array.length*2;
            array = Arrays.copyOf(array,newCapacity);
        }
    }
}
public class ArrayListImplemtation {
    public static void main(String[] arg){
        MyArrayList<String> list = new MyArrayList<>();
        System.out.println(list.size());
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Size of the Array List : " + list.size());
        System.out.println("Element at index 0 : " + list.get(0));

    }
}
