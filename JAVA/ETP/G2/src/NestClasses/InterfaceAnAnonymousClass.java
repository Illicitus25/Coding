package NestClasses;

class A{
    int x=10;
    void display(){
        System.out.println("In Class A");
    }
}

public class InterfaceAnAnonymousClass {
     public static void main(String[] args) {
        A obj = new A(){
            @Override
            void display() {
                System.out.println("In Anonymous Class");
            }
        };

        obj.display();

        A obj2 = new A();
        obj2.display();
    }
}
