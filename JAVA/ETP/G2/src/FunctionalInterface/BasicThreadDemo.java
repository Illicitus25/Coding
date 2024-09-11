package FunctionalInterface;

public class BasicThreadDemo {
    public static void main(String arg[]){

        Thread t1 = new Thread( () -> {
                for (int i=1;i<=5;i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(500);
                    }
                    catch (Exception e) {}
                }
            });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        t1.start();
        t2.start();


        System.out.println(t1.isAlive());
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.isAlive());
        System.out.println("Byee");








































    }
}
