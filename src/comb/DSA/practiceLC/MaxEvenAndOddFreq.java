package comb.DSA.practiceLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaxEvenAndOddFreq {
    public static void main(String[] args) {
        String s = "mmsmsym";
        System.out.println(maxDifference(s));
    }
    public static int maxDifference(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        ArrayList<Integer> oddFreq = new ArrayList<>();
        ArrayList<Integer> evenFreq = new ArrayList<>();
        for(int i : freq){
            if(i!=0){
                if(i%2==0) evenFreq.add(i);
                else oddFreq.add(i);
            }

        }
        Collections.sort(oddFreq, Comparator.reverseOrder());
        Collections.sort(evenFreq);

        System.out.println(oddFreq);
        System.out.println(evenFreq);

        System.out.println(Arrays.toString(freq));
        return oddFreq.get(0)-evenFreq.get(0);
    }
}
