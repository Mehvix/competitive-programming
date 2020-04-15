import java.util.*;

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int total = 0;
        int zeros = 0;
        for(int i : nums){
            if (i != 0){
                if (total == 0){
                    total ++;
                }
                total *= i;
            } else {
                zeros ++;
            }
        }
        int[] ans = new int[nums.length];
        if (zeros > 1){return ans;}

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (zeros == 1) {
                if(value == 0){
                    ans[i] = total;
                }
            } else {
                ans[i] = total / value;
            }
        }

        return ans;
    }
}