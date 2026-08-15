// variation of unbounded knapsack
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;//1st str is empty
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;//2nd str is empty
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int a = dp[i][j - 1];
                    int b = dp[i - 1][j];
                    dp[i][j] = Math.max(a, b);
                }
            }
        }
        return dp[n][m];
    }
}