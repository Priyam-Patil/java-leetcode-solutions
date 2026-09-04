class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int minArr[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            minValue = Math.min(minValue, nums[i]);
            minArr[i] = minValue;
        }
        int maxV = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxV = Math.max(maxV, nums[i]);
            int minV = minArr[i];
            if (maxV - minV <= k) {
                return i;
            }
        }
        return -1;
    }
}