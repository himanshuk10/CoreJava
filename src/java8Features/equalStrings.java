package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class equalStrings {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRac1";
//        String[] s11 = s1.split("");
//        String[] s21 = s2.split("");

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if(s1.equals(s2)) System.out.println("Anagram");
        else System.out.println("Not anagram");



    }
}
