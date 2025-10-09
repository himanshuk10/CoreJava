package comb.CoreJavaInterview.multithreading;

class Counter{
    private int count;
    public synchronized void increment(){
        count++;
    }
    public int getCount() {
        return count;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    counter.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(t1.getState());
        System.out.println(counter.getCount());

    }
}
