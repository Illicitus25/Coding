package NestClasses;

class Outer{
    private int outerX;

    class Inner{
         int innerX;

        void showX(){
            System.out.println(outerX + " " + innerX);
        }
    }

    public void display(){
        Inner inner = new Inner();
        inner.innerX = 3;
        inner.showX();
    }
}
public class PrivateExample {
    public static void main(String arg[]){
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = outer.new Inner();
        inner.innerX = 12;
        inner.showX();
    }
}
