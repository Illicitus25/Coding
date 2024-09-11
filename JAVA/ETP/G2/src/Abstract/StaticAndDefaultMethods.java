package Abstract;

class Bird{
    public void sound(){
        System.out.println("Bird Song");
    }

    public static void stay(){
        System.out.println("Bird Stay");
    }
}
class Pigeon extends Bird{
    @Override
    public void sound(){
        System.out.println("Pigeon Song");
    }

    public static void stay(){
        System.out.println("Pigeon Stay");
    }

}
public class StaticAndDefaultMethods {
    public static void main(String a[]){
        Pigeon pigeon = new Pigeon();
        pigeon.sound();
        Pigeon.stay();

        Bird bird = new Pigeon(); // upcasting
        bird.sound();
        Bird.stay();
    }
}
