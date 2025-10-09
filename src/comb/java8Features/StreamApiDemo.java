package comb.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,8,1);

        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==1;
            }
        };
//        Predicate<Integer> predi = n -> n%2==1;

//        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer n) {
//                return n*n;
//            }
//        };

//        Function<Integer, Integer> fun = n -> n*n;


//        nums.stream()
//                .filter(n -> n%2==1) //filter(object of predicate)
//                .sorted()
//                .map(n -> n*n)
//                .forEach(n -> System.out.println(n));

        int num = nums.stream()
                .filter(n -> n%2==1) //filter(object of predicate)
                .map(n -> n*n)
                .reduce(0, (c,e)-> c+e);

        System.out.println(num);

//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n -> System.out.println(n));
//        System.out.println(data.count());

        /*
        * once we consume the stream we can't use again
        * The main purpose of using stream api is to perform any operations without changing the existing value
        * intermediate operations transform a stream into another stream eg: filter(predicate),sorted(),distinct(),map().
        * while terminal operations produce a result eg: collect(), count(), forEach()
        * map() -> when we want to perform operation on each object
        **/

    }
}
