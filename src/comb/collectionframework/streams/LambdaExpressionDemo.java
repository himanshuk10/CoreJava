package comb.collectionframework.streams;
@FunctionalInterface
interface Animal{
    void eat();
//    void run();//compilation error
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Animal animal = () -> System.out.println("Animal is eating");
        animal.eat();
    }
}
