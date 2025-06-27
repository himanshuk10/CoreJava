package comb.DSA;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/?envType=daily-question&envId=2025-04-08
public class DistinctOps {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,3,5,7};
        System.out.println(minimumOperations(arr));
    }
    public static int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=nums.length-1; i>=0; i--){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                return (i/3)+1;
            }
        }
        return 0;
    }
}
