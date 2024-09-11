package FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] arg){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,78,9,10);
        int sum = 0;

        int evenNUmbersSum = numbers.stream()
                                    .filter(num -> num%2 ==0)
                                    .mapToInt(Integer::intValue)
                                    .sum();

        System.out.println(evenNUmbersSum);
    }
}
