package comb.java8Features.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDisNumInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int k = 0;
        for(int i=1; i<=arr.length; i++){
            if(!list.contains(i)) {
                list.add(k++, i);
            }
        }
        System.out.println(list);
        return list.subList(0, k);
    }
}
