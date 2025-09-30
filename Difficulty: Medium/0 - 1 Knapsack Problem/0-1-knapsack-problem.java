class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        // Build DP table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;  // base case: no items or zero capacity
                } else if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]],
                                        dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];  // cannot take current item
                }
            }
        }
        return dp[n][W];  // maximum value achievable
    }
}
