package comb.collectionframework.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/*
   * Java 8 --> minimal code, functional programmings
   * Java 8 --> lambda expression, Streams, Date & Time API
   * lambda expression is an anonymous function(no name, no return type, no access modifier)
 */
public class Java8Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("hello"));
        t1.start();
//        Operation operation = new Operation();
//        int operate = operation.operate(2, 3);
//        System.out.println(operate);
        MathOperation sumOperation = (a,b) ->  a + b;
        int sum = sumOperation.operate(2, 3);
        System.out.println("sum: "+sum);
        MathOperation subOperation1 = (a,b) ->  a - b;
        MathOperation mulOperation2 = (a,b) ->  a * b;
        MathOperation modOperation3 = (a,b) ->  a % b;

        //Predicate --> Function Interface --> (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Number is Even: "+isEven.test(4));
        Predicate<String> isWordStratsWithA = str -> str.startsWith("A");
        Predicate<String> isWordEndsWitht = str -> str.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStratsWithA.and(isWordEndsWitht);
        System.out.println(and.test("Amit"));

        //Funtion --> work for you
        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> tripleIt = x -> x*3;
        System.out.println( doubleIt.andThen(tripleIt).apply(100));
        System.out.println(doubleIt.apply(100));

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(5));

        //Consumer
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(100);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x ->{
            for (int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        //Combined example
        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;
        if(predicate.test(supplier.get())){
            consumer1.accept(function.apply(supplier.get()));
        }

        //BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y)%2==0;
        System.out.println(isSumEven.test(2,3));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("a", "bc"));


        //UnaryOperator, BinaryOperator
       // Function<Integer, Integer> a = x -> x*2;
        UnaryOperator<Integer> a = x -> x*2;
        BinaryOperator<Integer> b = (x, y) -> x + y;
//        BinaryOperator<Integer> b = Integer::sum;



        //Method Reference --> use method without invoking & in place of lambda expression
        List<String> student = Arrays.asList("Ram", "Shyam", "Mohan");
        student.forEach(x -> System.out.println(x));
        student.forEach(System.out::println);

        //Construction Reference
        List<String> names = Arrays.asList("A","B","C");
        List<MobilePhone> collect = names.stream().map(MobilePhone::new).toList();

    }
}
class MobilePhone{
    String name;
    public MobilePhone(String name){
        this.name = name;
    }
}

//class Operation implements MathOperation{
//
//    @Override
//    public int operate(int a, int b) {
//        return a+b;
//    }
//}

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}
//class Task implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("hello");
//    }
//}
