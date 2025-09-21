package comb.java8Features.questions.functionalInterface;


interface Animal{
    void bark();
}

class A implements Animal{

    @Override
    public void bark() {
        System.out.println("Animal is barking A");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Animal animal = () -> System.out.println("Animal is barking");
        animal.bark();

        Animal animal1 = new Animal() {
            @Override
            public void bark() {
                System.out.println("Animal anonymous is barking");
            }
        };
        animal1.bark();

        A obj = new A();
        obj.bark();


    }
}
