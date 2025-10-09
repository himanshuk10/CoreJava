package comb.CoreJavaInterview;

/*Can we add synchronize to run method, Will code compile? -> Yes, we can synchronize a run()
  method in Java, but it is not required because this method has been executed by a single thread only.
 */
class Task implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running the method : "+i+" Thread :"+Thread.currentThread().getName());
        }
    }
}

public class SyncRun {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());

        t1.start();
        t2.start();

    }
}
