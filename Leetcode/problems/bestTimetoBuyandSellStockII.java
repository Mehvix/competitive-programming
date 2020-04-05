import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;

        for (int i = 0; i < n - 1; i++) {
            profit += Math.max(0, prices[i + 1] - prices[i]);
        }
        return profit;
    }
}