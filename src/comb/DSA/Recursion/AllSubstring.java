package comb.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubstring {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println( subsets(num));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, ans);

        // Backtrack: remove the element before moving to exclude path
        current.remove(current.size() - 1);

        // Exclude the current element
        generateSubsets(index + 1, nums, current, ans);
    }
}
