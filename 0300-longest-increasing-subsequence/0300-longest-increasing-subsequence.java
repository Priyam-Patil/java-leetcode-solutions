
// LCS
import java.util.*;

class Solution {

    public int LCS(int[] nums, int[] nums1) {
        int n = nums.length;
        int m = nums1.length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;//sec arr does not have any values
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (nums[i - 1] == nums1[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i][j - 1];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public int lengthOfLIS(int[] nums) {
        // to remove duplicate entries
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] nums1 = new int[set.size()];
        int i = 0;
        for (int num : set) {
            nums1[i] = num;
            i++;
        }
        Arrays.sort(nums1);
        return LCS(nums, nums1);
    }
}