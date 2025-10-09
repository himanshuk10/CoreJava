package comb.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "HimaNshu";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        List ans = list.stream().map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i));
        }
        System.out.println(str+" -> "+sb.toString());
    }
}
