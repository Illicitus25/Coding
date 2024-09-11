package Abstract;

interface Animal{
    void sound();

    default void sleep(){
        System.out.println("Animal Sleep");
    }

    static void stay(){
        System.out.println("Animal Stay");
    }
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog sound");
    }

    @Override
    public void sleep(){
        System.out.println("Dog Sleep");
    }


    static void stay(){
        System.out.println("Dog Stay");
    }

}
public class SAndDInterfaceDemo {

    public static void main(String a[]){
        Dog d = new Dog();
        d.sleep();
//        d.stay();

        Animal animal = new Dog();
        animal.sleep();
//        animal.stay();
    }
}
