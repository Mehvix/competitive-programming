import java.util.*;


class Solution {
    public int subarraySum(int[] nums, int k) {
        // similar to checkValidString (day 16):
        // https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3301/

        HashMap<Integer, Integer> sumMap = new HashMap<>();  // value, occurrence
        sumMap.put(0, 1);
        int total_occurrences = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (sumMap.containsKey(sum - k)){
                total_occurrences += sumMap.get(sum - k);
            }

            sumMap.put(sum, 1 + sumMap.getOrDefault(sum, 0));
        }
        return total_occurrences;
    }
}