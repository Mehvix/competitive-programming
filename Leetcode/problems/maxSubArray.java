class Solution {
    public int maxSubArray(int[] nums) {
        int best = Integer.MIN_VALUE;
        int current = 0;
        for (int x : nums) {
            current = Math.max(x, current + x);
            best = Math.max(current, best);
        }
        return best;
    }
}