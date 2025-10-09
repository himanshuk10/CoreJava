package comb.interview;

public class Test {
    public static void main(String[] args) {
        SingletonDemo instance1 = SingletonDemo.getInstance();
        System.out.println(instance1.hashCode());
        SingletonDemo instance2 = SingletonDemo.getInstance();
        System.out.println(instance2.hashCode());
        System.out.println(instance1==instance2);
    }
}
