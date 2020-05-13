import java.util.*;

class Solution {
    public static int singleNonDuplicate(int[] nums) {
        int hi = nums.length/2;
        int lo = 0;

        while (lo < hi){
//            int mi = (hi + lo)/2;
            int mi = lo + (hi - lo)/2;
            if(nums[2*mi] != nums[2*mi+1]){  // extra is only in even indices
                hi = mi;
            } else {
                lo = mi + 1;
            }
        }
        return nums[2*lo];
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
        System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}