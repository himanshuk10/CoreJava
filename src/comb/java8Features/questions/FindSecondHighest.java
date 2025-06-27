package comb.java8Features.questions;

import java.util.*;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(20,26,12,13,4,9,2,100));
        System.out.println(number);

//        Collections.sort(number);
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1>o2) return 1;
//                else return -1;
//            }
//        };
//        number.sort(comparator);
//        System.out.println(number);

        Optional<Integer> ans = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if (ans.isPresent()){
            System.out.println("Second highest: "+ans.get());
        }else {
            System.out.println("Not present");
        }

    }
}
