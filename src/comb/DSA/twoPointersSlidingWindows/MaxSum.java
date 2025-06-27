package comb.DSA.twoPointersSlidingWindows;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int subArraySize = 4;
        System.out.println(maxSum(arr, subArraySize));
    }
    static int maxSum(int[] arr, int k){
        int maxSum = 0;
        int sum = 0;
        int left = 0;
        int right = k - 1;
        for(int i = 0; i< k; i++){
            sum += arr[i];
        }
        while (right < arr.length - 1){
            sum -= arr[left];
            left++;
            right++;
            sum += arr[right];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
