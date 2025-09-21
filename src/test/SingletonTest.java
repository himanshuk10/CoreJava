package test;


public class SingletonTest{
    private static SingletonTest instance;
    private SingletonTest(){
    }

    public static SingletonTest getInstance(){
        if (instance==null){
            synchronized (SingletonTest.class){
                if (instance == null){
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }

    @Override
    protected SingletonTest clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not supported");
    }
}
