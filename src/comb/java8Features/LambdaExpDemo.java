package comb.java8Features;

interface A {
    void show();
}

interface B {
    void square(int n);
}

//class xyz implements A{
//
//    @Override
//    public void show() {
//        System.out.println("Hello");
//    }
//}
public class LambdaExpDemo {
    public static void main(String[] args) {
        A obj;
//        obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("Hello");
//            }
//        };


        obj = () -> System.out.println("Hello");
        obj.show();

        B obj2;
        obj2 = (n) -> System.out.println("Square of " + n + " is : " + n * n);
        obj2.square(5);

        /*
        Def: A lambda expression is a short block of code which takes in parameters and returns a value.
        Lambda expressions are similar to methods, but they do not need a name and they can be implemented
        right in the body of a method.
        Syntax: parameter -> expression
        Conclusion: lambda expressions can't be used without functional interfaces in Java,
        so we must have a functional interface to work with Lambda expressions.
         */
    }
}
