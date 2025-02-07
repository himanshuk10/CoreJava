package DynamicProgrammings;

import java.util.Arrays;

public class KnapSackRecursive {
    public static void main(String[] args) {
        int[] weightt = {1,3,4,5};
        int[] value = {1,4,5,7};
        int capacity = 12;
        System.out.println(knapsackDP(weightt,value,capacity, weightt.length));
    }
//    static int knapsack(int[] wt, int[] val, int W, int n){
//        if(n==0 || W==0){
//            return 0;
//        }
//        if(wt[n-1] <= W){
//            return Math.max(val[n-1]+knapsack(wt,val,W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
//        } else if (wt[n-1] > W) {
//            return knapsack(wt, val, W, n-1);
//        }
//        return 0;
//    }
    static int knapsackDP(int[] wt, int[] val, int W, int n){
        int[][] dp = new int[100][100];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        if(n==0 || W==0){
            return 0;
        }

        if (dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            return dp[n][W] = Math.max(val[n-1]+knapsackDP(wt,val,W-wt[n-1], n-1), knapsackDP(wt, val, W, n-1));
        } else if (wt[n-1] > W) {
            return dp[n][W] = knapsackDP(wt, val, W, n-1);
        }
        return 0;
    }

}
