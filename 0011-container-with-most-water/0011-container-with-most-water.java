// two pointer
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;

        while (left < right) {
            int W = right - left;
            int H = Math.min(height[left], height[right]);
            int Currarea = W * H;
            ans = Math.max(ans, Currarea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return ans;
    }
}