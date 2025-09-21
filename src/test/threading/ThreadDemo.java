package test.threading;

//class World extends Thread{
//    @Override
//    public void run() {
//        for (; ; ) {
//            System.out.println("World");
//        }
//    }
//}

//class World implements Runnable{
//    @Override
//    public void run() {
//        for (; ; ) {
//            System.out.println("World");
//        }
//    }
//}

class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("Running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());//new
        myThread.start();
        System.out.println(myThread.getState());//runnable
        Thread.sleep(100);
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());

    }
}
