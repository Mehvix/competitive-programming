import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int index = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--) {  // count backwards because it's easier to find the largest jump
            int num = nums[i];
            if(index <= i + num){
                index = i;
            }
        }
        return index == 0;
    }
}