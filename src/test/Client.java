package test;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonTest instance = SingletonTest.getInstance();
        System.out.println(instance.hashCode());

        SingletonTest instance1 = SingletonTest.getInstance();
        System.out.println(instance1.hashCode());

        SingletonTest instance2 = instance1.clone();
        System.out.println(instance2.hashCode());
    }
}
