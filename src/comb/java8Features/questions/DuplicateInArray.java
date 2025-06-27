package comb.java8Features.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateInArray {
    public static void main(String[] args) {

//        Integer[] numbers = {1,2,6,5,2,3,8,3,1};
//        System.out.println(Removeduplicates2(numbers));
//        checkDuplicateWithoutStream(numbers);
        String[] name = {"RAM", "SHAYAM", "MOHAN","RAM", "SHAYAM", "MOHAN"};
        System.out.println(Removeduplicates(name));

    }
    private static <T> Set<T> Removeduplicates(T[] Values){
        Set<T> set = new HashSet<>();
        return Arrays.stream(Values)
                .filter(val -> set.add(val))
                .collect(Collectors.toSet());
    }
    private static <T> List<T> Removeduplicates1(T[] Values){
        List<T> collect = Stream.of(Values).distinct().collect(Collectors.toList());
        return collect;
    }
    private static List<Integer> Removeduplicates2(Integer[] numbers){
        List<Integer> collect = Stream.of(numbers).distinct().collect(Collectors.toList());
        return collect;
    }

    private static void checkDuplicateWithoutStream(Integer[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();
        for(Integer num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//            if(entry.getValue() > 1){
//                duplicates.add(entry.getKey());
//            }
//        }
        map.forEach((key,value) -> {
                if(value > 1) {
                    duplicates.add(key);
                }
        });
        System.out.println("Duplicate elements are: "+duplicates);
    }
}
