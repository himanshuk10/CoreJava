package functionalProgrammings;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateInArray {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,6,5,2,3,8,3,1};
//        System.out.println(checkduplicates(numbers));
        checkDuplicateWithoutStream(numbers);

    }
    private static <T> Set<T> checkduplicates(T[] numbers){
        Set<T> set = new HashSet<>();
        return Arrays.stream(numbers)
                .filter(val -> set.add(val))
                .collect(Collectors.toSet());
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
