package comb.java8Features;

import java.util.List;
import java.util.TreeSet;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,43,76,90,1,3,89);
//        printAllNumberInListStructured(numbers);
//        printEvenNumberInListStructured(numbers);

        TreeSet treeSet = new TreeSet<>();
//        treeSet.add(new StringBuilder("S"));
//        System.out.println(treeSet);

        treeSet.add(new StringBuffer("A"));
        System.out.println(treeSet);
    }

    private static void printAllNumberInListStructured(List<Integer> numbers) {
        for (Integer num:numbers) {
                System.out.println(num);
        }
    }
    private static void printEvenNumberInListStructured(List<Integer> numbers) {
        for (Integer num:numbers) {
            if(num%2==0) {
                System.out.println(num);
            }
        }
    }
}
