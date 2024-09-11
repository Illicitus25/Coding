package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadExample {

    private static void processTask(String id){
        System.out.println("Processing Thread : " + id );
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Processing is done for the thread :" + id);
    }



    public static void main(String arg[]){
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(()-> processTask("Task 1"));
        tasks.add(()-> processTask("Task 2"));
        tasks.add(()-> processTask("Task 3"));
        tasks.add(()-> processTask("Task 4"));
        List<Thread> threads = new ArrayList<>();
        for (Runnable task : tasks){
            Thread thread = new Thread(task);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads){
            try{
                thread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("All the threads are processed!");
    }
}
