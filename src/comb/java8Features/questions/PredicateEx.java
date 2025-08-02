package comb.java8Features.questions;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (i) ->  (i%2 == 0);
        boolean res = predicate.test(4);
        System.out.println(res);
    }
}
