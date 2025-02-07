package multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
