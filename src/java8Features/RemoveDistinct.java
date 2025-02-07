package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDistinct {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("Himanshu", "Aman", "Anas", "Aman", "Walkar"));
        List ans = name.stream().map(c -> c.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(ans);
    }
}