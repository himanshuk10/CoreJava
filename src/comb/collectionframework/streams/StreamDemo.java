package comb.collectionframework.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //feature introduced in java 8
        //process collection of data in a functional and declarative manner
        //simplify data processing
        //Enable function programmings
        //easy enable parallelism

        //what is stream?
        //a sequence of elements supporting functional and declarative programmings

        //how to use stream?-
        // Source --> intermediate ops --> terminal ops
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println("Even nums count: "+numbers.stream().filter(x -> x % 2 == 0).count());

        //creating Stream
        //1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream();
        //2. From Arrays
        String[] arr = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        //3. Using Stream.of()
        Stream<String> a = Stream.of("a", "b", "c");
        //4. Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);




    }
}
