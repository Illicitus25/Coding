package GenericsAndCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.lang.String;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person other){
        return Integer.compare(this.age,other.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ObjectsAndComparableInterface {
    public static void main(){
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Alice",30));
        personTreeSet.add(new Person("Bob",18));
        personTreeSet.add(new Person("Charlie",35));
        for (Person person : personTreeSet){
            System.out.println(person);
        }

    }
}
