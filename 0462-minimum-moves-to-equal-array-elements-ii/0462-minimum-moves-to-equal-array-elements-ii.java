
// 02/11
import java.util.*;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mediIDX = n / 2;
        int mediun = nums[mediIDX];
        int moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - mediun);
        }
        return moves;
    }
}