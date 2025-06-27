package comb.DSA;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testHash {
    public static void main(String[] args) {
         String s = "anagram", t = "nagaram" ;
        System.out.println(checkAnagram(s, t));
        System.out.println(checkAnagram1(s,t));
        int[] nums =  {0,0,1,1,1,2,2};
        System.out.println(duplicate(nums));
    }

    private static int duplicate(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }
        return k+1;
    }

    private static boolean checkAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < s.length(); i++) {
            if(chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }
    private static boolean checkAnagram1(String s, String t) {
        if(s.length() != t.length()) return false;
        /*Map<Integer, Long> maps = s.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> mapt = t.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return maps.equals(mapt);
         */
        boolean equals = s.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(t.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        return equals;
    }
}
