package comb.DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,1,1,3};
//        System.out.println(isUniqueOccurrences(arr));
        System.out.println(maxFreqSum(arr));
    }
    static boolean isUniqueOccurrences(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        Set<Integer> set = new HashSet<>(freq.values());
//        set.addAll(freq.values());

        return set.size() == freq.size();
    }
    static int maxFreqSum(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int ans = 0;
        for (int num : nums){
            map.put(num,map.getOrDefault(num, 0)+1);
            if (maxi < map.get(num)){
                maxi = map.get(num);
            }
        }
        for (int ele : map.values()){
            if (ele == maxi){
                ans += maxi;
            }
        }
        return ans;
    }
}
