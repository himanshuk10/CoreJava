package comb.DSA;

import java.util.Arrays;

public class LargestPerimeterTringle {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4};
        System.out.println(largestPerimeter(arr));
    }
    public static int largestPerimeter(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);//[2,3,3,4]
        for(int i=nums.length-1; i>1; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                ans = nums[i] + nums[i-1] + nums[i-2];
                break;
            }
        }
        return ans;
    }
}
