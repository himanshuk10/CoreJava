package test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
//        generateUsernames(1000);
//        mapVsFlatMap();
//        partitionBy();
//        countFreq();
        moveZero();
    }
    public static void generateUsernames(int n) {
        String format = "%05d";
        for (int i = 1; i <= n; i++) {
            String str = "himanshu"+String.format(format,i);
            System.out.println(str);
        }
    }
    public static void mapVsFlatMap(){
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> list1 = list.stream().map(num -> num * 2).toList();
        System.out.println(list1);
        List<List<Integer>> list2 = Arrays.asList(Arrays.asList(1,2,3,4,5), Arrays.asList(9,7,5,6));
        List<Integer> list3 = list2.stream().flatMap(Collection::stream).map(num -> num * 2).toList();
        System.out.println(list3);
    }
    public static void partitionBy(){
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        Map<String, List<Integer>> collect1 = collect.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey() ? "EVEN" : "ODD",
                Map.Entry::getValue));
        System.out.println(collect1);
    }
    public static void countFreq(){
        String str = "ASDFGHJSDFGHJ ";
        Map<String, Long> frequency = Arrays.stream(str.split(""))
                .filter(s -> !s.equals(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);
    }
    public static void moveZero(){
        int[] arr = {1,0,2,3,0,9,0,2,3};
        int idx = arr.length-1;
//        for (int num : arr){
//            if (num != 0){
//                arr[idx++] = num;
//            }
//        }
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] != 0){


                arr[idx--] = arr[i];
            }
        }
        while (idx >= 0){
            arr[idx--] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
