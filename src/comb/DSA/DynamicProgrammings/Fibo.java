package comb.DSA.DynamicProgrammings;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(7)

        );
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        int[] dp = new int[n+1]; // [-1,-1,-1,-1,-1,-1]
        dp[0] = 0; // [0,-1,-1,-1,-1,-1]
        dp[1] = 1; // [0, 1,-1,-1,-1,-1]
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
