package comb.DSA.practiceLC;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));
    }
    public static String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();
    }
}
