package NestClasses;

class OuterClass{
    static int outer_x = 10;
    int outer_y = 23;
    private int outer_private = 56;

    class NestedClass{
        void display(){
            System.out.println("outer x : " + outer_x);

            System.out.println("outer private : " + outer_private);

            System.out.println("outer_y : " + outer_y);
        }
    }
}
public class NonStaticNestedDemo {
    public static void main(String[] arg){
        OuterClass outerObject = new OuterClass();
        OuterClass.NestedClass innerObject = outerObject.new NestedClass();
        innerObject.display();
    }
}
