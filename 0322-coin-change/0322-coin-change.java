// variation of unbounded knapsack
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        // for amt=0 their is has one way(to not give amt)
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        // coins=0-->impossible
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = amount + 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    int include = 1 + dp[i][j - coins[i - 1]];
                    int exclude = dp[i - 1][j];
                    dp[i][j] = Math.min(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount] > amount ? -1 : dp[n][amount];
    }
}