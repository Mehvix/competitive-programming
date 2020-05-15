class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int curMax = 0;
        int minSum = Integer.MAX_VALUE;
        int curMin = 0;

        for (int x : A) {
            curMax = Math.max(curMax + x, x);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + x, x);
            minSum = Math.min(minSum, curMin);
            totalSum += x;
        }

        if (maxSum > 0) {
            return Math.max(maxSum, totalSum - minSum);
        } else { return maxSum; }
    }
}