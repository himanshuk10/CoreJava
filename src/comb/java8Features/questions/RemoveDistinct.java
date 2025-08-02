package comb.java8Features.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDistinct {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("Himanshu", "Aman", "Anas", "Aman", "Walkar"));
        List ans = name.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
//        List<String> collect = name.stream().map(str -> str.toUpperCase()).distinct().collect(Collectors.toList());
//        System.out.println(collect);

    }
}