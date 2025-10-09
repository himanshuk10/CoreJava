package comb.designpattern.singleton;

public class SingletonDemo implements Cloneable{
    private static SingletonDemo instance;
    private SingletonDemo(){
        if (instance!=null){
            throw new RuntimeException("use getInstance method to create object");
        }
        System.out.println("Instance Created");
    }

    public static SingletonDemo getInstance(){
        if (instance==null){
            synchronized (SingletonDemo.class){
                if (instance==null)
                    instance = new SingletonDemo();
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed");
    }
}
