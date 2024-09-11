
class Animal{

    void makeSound(){
        System.out.println("Generic Sound!");
    }
}
class Dog extends Animal{
   @Override
    void makeSound(){
        System.out.println("Bow Bow!");
    }

}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow Meow!");
    }
}
public class MethoOverridingDemo {
    public static void main(String[] args) {

    }
}
