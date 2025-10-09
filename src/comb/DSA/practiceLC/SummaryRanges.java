package comb.DSA.practiceLC;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            int first = nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(first == nums[i]){
                ans.add(first+"");
            }else{
                ans.add(first+"->"+nums[i]);
            }
        }
        return ans;
    }
}
