package comb.DSA.practiceLC;
//https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/?envType=daily-question&envId=2025-05-04

import java.util.*;

public class EquivalentDominoPairs {
    public static void main(String[] args) {
        int[][] dominoes = {{1,2}, {1,2}, {1,1}, {1,2}, {2,2}};
        System.out.println(numEquivDominoPairs(dominoes));
    }
    public static int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            String key = a < b ? a + "," + b : b + "," + a;
            int val = map.getOrDefault(key, 0);
            count += val;
            map.put(key, val+1);
        }
        return count;
    }
}
