package comb.DSA;

import java.util.HashSet;
import java.util.Set;

public class CountSimilarStrings {
    public static void main(String[] args) {
        String[] words = {"aabb","ab","ba"};
        System.out.println(similarPairs(words));
        System.out.println(sameString("bac", "aabc"));
    }
    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i <= words.length-2; i++) {
            for (int j = i+1; j <= words.length-1; j++) {
                if (sameString(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean sameString(String str1, String str2){
        Set hashSet = new HashSet<>();
        Set hashSet1 = new HashSet<>();
//        for (char ch : str1.toCharArray()) {
//            hashSet.add(ch);
//        }
//        for (char ch1 : str2.toCharArray()) {
//            hashSet1.add(ch1);
//        }
//        return hashSet.equals(hashSet1);

        for (int i = 0; i < str1.length(); i++) {
            hashSet.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            hashSet1.add(str2.charAt(i));
        }
        return hashSet.equals(hashSet1);
    }
}
