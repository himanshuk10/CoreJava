package comb.CoreJavaInterview.TrickyQuestionCoreJava;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int target = 18;
        int[] arr = {2, 7, 11, 15};
        int[] ans = twoSum(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        System.out.println(map);

        for(int i=0; i<nums.length; i++){
            int key = target-nums[i];
            if(map.containsKey(key) && map.get(key)!=i){
                return new int[]{i, map.get(key)};
            }
        }
        return new int[]{-1,-1};
    }
}
