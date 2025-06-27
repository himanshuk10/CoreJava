package comb.collectionframework.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeQuestions {
    public static void main(String[] args) {
        //count frequency of each word in a sentence
        String str = "java is a programming language java is good for development";
        Map<String, Long> wordCount = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(wordCount);

        //count each character in a sentence
        String str1 = "Hello World";
        Map<Character, Long> collect = str1.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        System.out.println(collect);
        //2nd highest salary
        List<Integer> salary = Arrays.asList(100000, 30000, 40000, 25000, 15000);
        Integer secondHighest = salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);
    }
}
