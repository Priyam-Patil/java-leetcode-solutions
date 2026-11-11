

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];

            if (l > r) {
                ans[index] = l;
                left++;
            } else {
                ans[index] = r;
                right--;
            }
            index--;
        }
        return ans;
    }
}