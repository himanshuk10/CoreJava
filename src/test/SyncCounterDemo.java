package test;

import static java.lang.Thread.State.TERMINATED;

class Counter{
    int count = 0;
    public void increment(){
        synchronized (Counter.class){
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
public class SyncCounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    counter.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    counter.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.getState());
        System.out.println(counter.getCount());

    }
}
