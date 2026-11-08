import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int preSum = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum = (preSum + nums[i]) % k;
            if (map.containsKey(preSum)) {
                if ((i - map.get(preSum)) >= 2) {
                    return true;
                }
            } else {
                map.put(preSum, i);
            }
        }
        return false;
    }
}