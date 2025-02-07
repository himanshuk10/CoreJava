package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//In given list of names and filter names which start with "A"
public class FilterA {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Himanshu", "Aman", "Alok", "Vishal","Anshu");

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String n) {
//                return n.startsWith("A");
//            }
//        };

        Predicate<String> predicate = (n) ->  n.startsWith("A");

        List<String> ans = name.stream()
                .filter(n-> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
