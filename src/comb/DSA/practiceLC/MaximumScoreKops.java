package comb.DSA.practiceLC;

import java.util.PriorityQueue;

public class MaximumScoreKops {
    public static void main(String[] args) {
        int[] arr = {1,10,3,3,3};
        int k = 3;
        System.out.println(maxKelements(arr,k));
    }
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pq.offer(num);
        }
        long maxScore = 0;
        while (k-- > 0) {
            int num = pq.poll();
            maxScore += num;
            pq.offer((num + 2) / 3);
        }
        return maxScore;
    }
}
