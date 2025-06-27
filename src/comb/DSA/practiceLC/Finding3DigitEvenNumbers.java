package comb.DSA.practiceLC;

import java.util.Set;
import java.util.TreeSet;

//https://leetcode.com/problems/finding-3-digit-even-numbers/description/?envType=daily-question&envId=2025-05-12
public class Finding3DigitEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {2,1,3,0};
        int[] findEvenNumbers = findEvenNumbers(nums);
        for (int numbers : findEvenNumbers){
            System.out.println(numbers);
        }
    }
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new TreeSet<>();//duplicate not allowed and element sorted
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // Hundreds place cannot be 0
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                        result.add(num);
                    }
                }
            }
        }
        int[] ans = new int[result.size()];
        int k = 0;
        for(int element : result){
            ans[k++] = element;
        }
        return ans;
    }
//    public static int[] findEvenNumbers(int[] digits) {
//        int[] ans = new int[]{1000};
//        int k = 0;
//        for (int i = 100; i < 1000 ; i++) {
//            if(isContains(i, digits) && i%2==0){
//                ans[k++] = i;
//            }
//        }
//        return ans;
//    }
//    static boolean isContains(int number, int[] nums){
//        String str = String.valueOf(number);
//        String[] stringArray = str.split("");
//        return isSubset(nums, stringArray);
//    }
//    static boolean isSubset(int[] a, String[] b) {
//        // Iterate over each element in the second array
//        int m = a.length;
//        int n = b.length;
//        for (int i = 0; i < n; i++) {
//            boolean found = false;
//            // Check if the element exists in the first array
//            for (int j = 0; j < m; j++) {
//                if (Integer.parseInt(b[i]) == a[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            // If any element is not found, return false
//            if (!found) return false;
//        }
//        // If all elements are found, return true
//        return true;
//    }
}
