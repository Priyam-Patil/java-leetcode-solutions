import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxPr = 0;
        for (int currPrice : prices) {
            if (buyPrice < currPrice) {
                int profit = currPrice - buyPrice;
                maxPr = Math.max(maxPr, profit);
            } else {
                buyPrice = currPrice;
            }
        }
        return maxPr;
    }
}