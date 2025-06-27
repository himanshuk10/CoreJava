package comb.DSA.twoPointersSlidingWindows;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,5,1,10,10};
        int k = 14;
        System.out.println(longestSubArraySum(arr, k));
    }
    static int longestSubArraySum(int[] arr, int k){
        int n = arr.length;
        int l = 0, r = 0, sum = 0, maxlen = 0;
        while(r < n-1){
            sum += arr[r];
            while(sum > k){
                sum -= arr[l];
                l = l + 1;
            }
            if(sum <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}
