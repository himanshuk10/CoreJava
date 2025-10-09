package comb.DSA.practiceLC;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompleteWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
        shortestCompletingWord(licensePlate, words);
    }
    public static void shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        int n = licensePlate.length();
        for(int i=0; i<n; i++){
            Character ch = licensePlate.charAt(i);
            if(!Character.isDigit(ch)){
                if(map.containsKey(ch)){
                    int ii = map.get(ch);
                    map.put(ch, ++ii);
                }else{
                    map.put(ch, 1);
                }
            }
        }
        System.out.println(map);
    }
}
