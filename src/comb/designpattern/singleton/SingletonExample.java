package comb.designpattern.singleton;

public class

SingletonExample {
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
        if (singletonExample != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        System.out.println("Instance is created");
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed");
    }
}
