package Abstract;

abstract class Shape{
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    abstract double calculateArea();

    public void displayInfo(){
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return 3.14 * radius * radius;
    }
}

class Square extends Shape{
    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea(){
        return side * side;
    }
}

public class AbstarctClassAndMethodsDemo {
    public static void main(String a[]) {
        Circle circle = new Circle("Red",2);
        Square square = new Square("Orange",4);

        circle.displayInfo();
        System.out.println(circle.calculateArea());

        square.displayInfo();
        System.out.println(square.calculateArea());
    }
}
