package comb.java8Features;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, Welcome To My Home";
        String s = supplier.get();
        System.out.println(s);
        /*
        The Supplier Functional interface represents a "supplier" of results.
        It is used when you need to generate or provide a value without taking any input arguments.
        Abstract Method: It defines a single abstract method: T get().
         */
    }
}
