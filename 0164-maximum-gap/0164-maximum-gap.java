import java.util.*;

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return 0;
        }
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i + 1]));

        }
        return maxDiff;
    }
}