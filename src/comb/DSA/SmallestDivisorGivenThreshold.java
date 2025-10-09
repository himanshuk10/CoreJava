package comb.DSA;
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/submissions/1607373161/?envType=problem-list-v2&envId=e5vjd5xs

public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        System.out.println(smallestDivisor(nums, threshold));
//        System.out.println(ceilDiv(9, 5));
    }
    public static int smallestDivisor(int[] nums, int threshold){
        int left = 1;
        int right = getMax(nums);
        int ans = right;
        while (left <= right){
            int mid = left + (right-left)/2;
            int sum = 0;
            for(int num : nums){
                sum += ceilDiv(num, mid);
            }
            if(sum <= threshold){
                ans = mid;// this could be the answer, try smaller one (than mid)
                right = mid - 1;
            }else{
                left = mid + 1;// need bigger divisor
            }
        }
        return ans;
    }
    public static int ceilDiv(int a, int b) {
        return (a + b - 1) / b;
    }
    private static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }

//    public static int smallestDivisor(int[] nums, int threshold){
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i < getMax(nums); i++) {
//            int result = 0;
//            for (int j = 0; j < nums.length; j++) {
//                result += ceilDiv(nums[j], i);
//            }
//            list.add(result);
//        }
//        System.out.println(list);
//        int[] arr = new int[list.size()];
//        for (int i=0; i<list.size(); i++){
//            arr[i] = list.get(i);
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        return findFloor(arr, threshold);
//    }
}
