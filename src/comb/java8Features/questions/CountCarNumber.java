package comb.java8Features.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of Car brands, get the count of every car brand in the format of a map
public class CountCarNumber {
    public static void main(String[] args) {
        List<String> carBrands = Arrays.asList("Toyota", "Honda", "Ford", "Toyota", "BMW", "Honda", "Toyota");
        Map<String, Long> collect = carBrands.stream().collect(Collectors.groupingBy(car -> car, Collectors.counting()));
        System.out.println(collect);

        String str ="Himanshu";
        String str1 = "I am the boss I am the hero";
        String[] split = str1.split(" ");
        Map<String, Long> collect1 = Arrays.stream(split).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect1);


        //Given any integer list, fetch the third highest value from the list using Streams API
        List<Integer> numbers = Arrays.asList(10, 40, 20, 30, 50, 50, 40);
        Integer integer = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();
        System.out.println(integer);


    }
}
