package FunctionalInterface;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExample {
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate){
        List<Integer> filteredList = new ArrayList<>();
        for (Integer num : list){
            if(predicate.test(num)){
                filteredList.add(num);
            }
        }
        return filteredList;
    }
    public static void main(String arg[]){
        List<Integer> numbers = Arrays.asList(1,2,3,56,74,9,89,102);
        List<Integer> evenNumbers = filter(numbers,num -> num%2==0);

        System.out.println("Even numbers");
        for (Integer num : evenNumbers){
            System.out.println(num);
        }
    }
}
