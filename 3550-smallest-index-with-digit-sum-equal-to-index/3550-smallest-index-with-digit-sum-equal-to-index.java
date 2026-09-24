

class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int curr = nums[i];
            while (curr > 0) {
                int last = curr % 10;
                sum += last;
                curr /= 10;

            }
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}