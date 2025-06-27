package comb.java8Features.questions;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int sum = String.valueOf(n).chars()     //int to string to stream
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
