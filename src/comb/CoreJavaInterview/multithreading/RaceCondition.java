package comb.CoreJavaInterview.multithreading;

class MyThread implements Runnable{

    int count = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        }
    }

    public int getCount(){
        return count;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final value of thread counter : "+myThread.getCount());
    }
}
