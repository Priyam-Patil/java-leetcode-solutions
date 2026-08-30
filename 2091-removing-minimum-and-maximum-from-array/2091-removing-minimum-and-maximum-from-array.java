

class Solution {
    public int minimumDeletions(int[] nums) {
        int min_idx = 0;
        int max_idx = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[min_idx]) {
                min_idx = i;
            }
            if (nums[i] > nums[max_idx]) {
                max_idx = i;
            }
        }
        int left = Math.min(min_idx, max_idx);
        int right = Math.max(min_idx, max_idx);
        int min_dele = Math.min((left + 1) + (n - right), Math.min((right + 1), (n - left)));
        return min_dele;
    }
}