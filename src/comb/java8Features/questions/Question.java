package comb.java8Features.questions;

import java.util.Arrays;
import java.util.List;

public class Question {
    public static void main(String[] args) {
        /*
        //From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,10,15,90,20,18));
        List ans = list.stream().filter(i -> i%5==0).map(i -> i*2).collect(Collectors.toList());
        System.out.println(ans);
         */

        /*
        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,10,15,90,20,18));
        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("max-->"+max+": min-->"+min);
         */

        /*
        // How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] arr1 = {2,5,3,7};
        int[] arr2 = {9,8,1,10};
//      int[] ans = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        int[] ans = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(ans));

         */

        /*
        //How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] arr1 = {2,5,3,7,8};
        int[] arr2 = {9,8,1,10,5};
//      int[] ans = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
        int[] ans = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(ans));

         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);




    }
}
