import java.util.*;

class Solution {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int i = 0;

        while (i < nums.length - count - 1) {
            int value = nums[i];
            if (value == 0) {
                count++;

                for (int j = i; j < nums.length - count; j++) {
                    nums[j] = nums[j + 1];
                }

                if (nums.length - count - 1 < 0){
                    break;
                } else {
                    nums[nums.length - count - 1] = nums[nums.length - count];
                    nums[nums.length - count] = 0;
                }
            }
            if (nums[i] != 0) {
                i++;
            }
        }
    }
}