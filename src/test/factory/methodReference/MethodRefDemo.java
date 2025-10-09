package test.factory.methodReference;

class Message {
    public static void show() {
        System.out.println("Hello from instance method!");
    }
}
public class MethodRefDemo {
    public static void main(String[] args) {
//        Message message = new Message();
        Runnable runnable = Message::show;
        runnable.run();

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
