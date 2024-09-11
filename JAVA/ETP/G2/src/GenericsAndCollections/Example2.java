package GenericsAndCollections;

import java.util.List;

public class Example2 {
    public static double sumOfList(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number num : list){
            sum += num.doubleValue();
        }
        return sum;
    }
    public static void main(String[] arg){
        List<Integer> intArray = List.of(1,2,3,4,5);
        List<Double> doubleArray = List.of(3.42,23.56,78.52);
        System.out.println(sumOfList(intArray));
        System.out.println(sumOfList(doubleArray));
    }
}
