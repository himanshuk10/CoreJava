package comb.java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeJava8 {
    public static void main(String[] args) {
//        String s= "listen";
//        String s1="netsli";
//        System.out.println(checkAnagram(s, s1));
//        List<Integer> list = List.of(11, 12 , 17 , 100, 91);
//        List<Integer> collect = list.stream().filter(num -> String.valueOf(num).startsWith("1")).toList();
//        System.out.println(collect);
//        System.out.println(hashUnique("abcd"));
//        countCar();
//        removeDuplicate();
//        findSecondHighest();
//        calc();
//        distinctName();
//        mergeTwoUnsortedArrays();
//        checkAnagramStream();
//        sumOfDigits();
//        countFrequency();
//        moveZerosToEndStart();
    }

    private static void moveZerosToEndStart() {
        int[] arr = {1,2,3,0,3,0,6,0,9};
//        To end
//        int count = 0;
//        for (int num : arr){
//            if(num != 0)
//                arr[count++] = num;
//        }
//        while (count < arr.length){
//            arr[count++] = 0;
//        }
//        System.out.println(Arrays.toString(arr));

//        To start
        int count = arr.length-1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[count--] = arr[i];
            }
        }
        while (count >= 0){
            arr[count--] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
    private static void countFrequency() {
        String str = "Himanshu  ";
        Map<String, Long> freq = Arrays.stream(str.split(""))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);
    }
    private static void sumOfDigits() {
        int num = 12345;
        String string = String.valueOf(num);
        int sum = string.chars().map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
    private static void checkAnagramStream() {
        String s1 = "eye";
        String s2 = "eye";
        boolean anagram = Arrays.stream(s1.split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Arrays.stream(s1.split(""))
                        .sorted()
                        .collect(Collectors.joining())
                );
        System.out.println(anagram);
    }
    private static void mergeTwoUnsortedArrays() {
        // How do you merge two unsorted arrays without duplicate into single sorted array using Java 8 streams?
        int[] arr1 = {2,5,3,7,5,6};
        int[] arr2 = {9,8,1,10,10};
        int[] array = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
    private static void distinctName() {
        List<String> name = new ArrayList<>(Arrays.asList("Himanshu", "Aman", "Anas", "Aman", "Walkar"));
        List<String> list = name.stream().distinct().toList();
        System.out.println(list);
    }
    static void calc(){
        //From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,10,15,90,20,18));
        List<Integer> multiple5 = list.stream().filter(num -> num % 5 == 0).toList();
        System.out.println(multiple5);
        System.out.println("---------------------------------------------------");
        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4,5,10,15,90,20,18));
        Optional<Integer> max = list1.stream().max(Comparator.naturalOrder());
        System.out.println(max);
    }
    static boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }
        for (int count : freq){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
    static boolean hashUnique(String str){
//        return str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == str.length();
//        return size != str.length();
        return Stream.of(str).collect(Collectors.toSet()).size() == str.length();
    }
    static void countCar(){
        List<String> carBrands = Arrays.asList("Toyota", "Honda", "Ford", "Toyota", "BMW", "Honda", "Toyota");
        Map<String, Long> collect = carBrands.stream()
                .collect(Collectors.groupingBy(car -> car, Collectors.counting()));
        System.out.println(collect);
    }
    static void removeDuplicate(){
        Set<String> set = new HashSet<>();
        String[] name = {"RAM", "SHAYAM", "MOHAN","RAM", "SHAYAM", "MOHAN","Harish"};
        Object[] array = Arrays.stream(name).filter(s -> set.add(s)).toArray();
        System.out.println(Arrays.toString(array));
    }
    static void findSecondHighest(){
        List<Integer> number = new ArrayList<>(Arrays.asList(20,26,12,13,4,9,2,100));
        Optional<Integer> secondHighest = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighest.ifPresent(System.out::println);
    }

}
