package comb.java8Features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    /*
    *
    *
    * */
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Himanshu","amit","aman","rahul","nikhil");
//        name.forEach(i -> System.out.println(i));
        name.forEach(System.out::println);

    }
}
