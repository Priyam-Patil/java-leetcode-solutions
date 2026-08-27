
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int missing = -1;
        int repeated = -1;
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeated = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[] { repeated, missing };
    }
}