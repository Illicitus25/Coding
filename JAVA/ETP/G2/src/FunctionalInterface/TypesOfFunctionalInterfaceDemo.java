package FunctionalInterface;

import Abstract.InterfaceDemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypesOfFunctionalInterfaceDemo {
    public static void main(String arg[]){
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println(randomNumberSupplier.get());

        Consumer<String> messageConsumer = message -> System.out.println(message);
        messageConsumer.accept("Good Morning!");

        Predicate<Integer> isEven = num -> num %2 == 0 ;

        System.out.println("Is 4 even?" + isEven.test(4));
        System.out.println("Is 5 even?" + isEven.test(5));

        Function<Integer,Integer> doubleNumber = num -> num*2;

        System.out.println(doubleNumber.apply(6));

    }
}
