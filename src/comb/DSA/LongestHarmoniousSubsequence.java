package comb.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
    private static int findLHS1(int[] nums){
        //some issue
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int num1 = nums[i];
            for (int j = n-1; j >= 0 ; j--) {
                int num2 = nums[j];{
                    if (num2-num1 == 1){
                        ans = j-i+1;
                        break;
                    }
                }
            }
        }
        return ans;
    }
    private static int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            if (freqMap.containsKey(key + 1)) {
                int len = freqMap.get(key) + freqMap.get(key + 1);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
