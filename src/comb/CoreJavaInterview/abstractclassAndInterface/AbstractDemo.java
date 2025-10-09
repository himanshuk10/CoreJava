package comb.CoreJavaInterview.abstractclassAndInterface;

/*
*Q. can abstract class have constructor in java
*A. Abstract classes can have constructors to initialize common fields.
   * These constructors are called when a subclass is instantiated.
   * You cannot directly create an object of an abstract class using new.
   * Abstract class can also have fields
   * */

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructer called, name: "+name);
    }
    public abstract void makesound();

    public void eat(){
        System.out.println(name+" is eating.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makesound() {
        System.out.println(name + " says: Woof!");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.makesound();
        dog.eat();

    }
}
