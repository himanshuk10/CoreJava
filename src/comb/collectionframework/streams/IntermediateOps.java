package comb.collectionframework.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        //convert Stream to another Stream
        //they are lazy

        //1. Filter
        List<String> list = Arrays.asList("Aman", "Ram", "Shyam", "Ghanshyam");
        List<String> notStartWithA = list.stream().filter(x -> !x.startsWith("A")).collect(Collectors.toList());
        System.out.println(notStartWithA);

        //2. Map
        List<String> collect = list.stream().map(String::toUpperCase).toList();
        System.out.println(collect);

        //3. Sorted
        Stream<String> sortedStream = list.stream().sorted();
        List<String> sortedStreamusingComp = list.stream().sorted((a, b) -> a.length()-b.length()).toList();
        System.out.println(sortedStreamusingComp);

        //4. distinct
        List<String> name = Arrays.asList("Aman", "Ram", "Shyam", "Ghanshyam", "Aman");
        System.out.println(name.stream().distinct().filter(x -> x.startsWith("A")).count());

        //5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        //6. skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());
    }
}
