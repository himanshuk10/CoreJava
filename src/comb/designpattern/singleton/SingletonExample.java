package comb.designpattern.singleton;

public class SingletonExample {
    /*
    //Eager initialization
    private static SingletonExample singletonExample = new SingletonExample();
    private SingletonExample(){}
    public static SingletonExample getInstance(){
        return singletonExample;
    }

     */

    private static SingletonExample singletonExample;
    private SingletonExample(){
        System.out.println("instance is created");
    }
    public static SingletonExample getInstance(){
        if (singletonExample == null){
            synchronized (SingletonExample.class){
                if(singletonExample == null)
                    singletonExample = new SingletonExample();
            }
        }
        return singletonExample;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonExample instance1 = SingletonExample.getInstance();
                System.out.println(instance1.hashCode());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonExample instance2 = SingletonExample.getInstance();
                System.out.println(instance2.hashCode());
            }
        });
        t1.start();
        t2.start();

    }
}
