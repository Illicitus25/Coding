import java.util.ArrayList;
import java.util.List;

class Shape{
    void draw(){
        System.out.println("Drawing the shape");
    }
}

class Circle extends Shape{
    double radius;

    int getRadius(){
        return 4;
    }
}

class  Square extends Shape{
    double side;
    int getSide(){
        return 2;
    }

}
public class CastingDemo {

    public static void main(String a[]) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shape shape : shapes){
            if (shape instanceof  Circle){
                Circle c = (Circle) shape;
                c.getRadius();
            } else if ( shape instanceof  Square) {
                Square s = (Square) shape;
                s.getSide();
            }
        }

    }
}
