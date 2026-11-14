// two pointer
class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int LMax = 0, RMax = 0;
        int ans = 0;
        
        while (l < r) {
            LMax = Math.max(LMax, height[l]);
            RMax = Math.max(RMax, height[r]);
            if (LMax < RMax) {
                ans += (LMax - height[l]);
                l++;
            } else {
                ans += (RMax - height[r]);
                r--;
            }
        }
        return ans;
    }
}