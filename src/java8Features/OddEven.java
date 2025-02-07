package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.add(11);
        System.out.println(list);

        Predicate<Integer> predEven = (Integer i) -> {
                return i%2==0;
            };

        List even = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List odd = list.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
        System.out.println(odd);
    }
}
