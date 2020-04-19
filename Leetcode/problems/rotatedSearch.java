import java.util.*;

class Solution {
    public static int search(int[] nums, int target) {
        /* outline
         * 1. find min (rotation amount)  -- o(log(n))
         * 2. binary search -- o(log(n))
         */
        int n = nums.length;
        int min = 0;
        int max = n - 1;

        while(min < max){
            int mid = (min + max) / 2;
            if(nums[mid] > nums[max]){
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        int rotation = min;
        min = 0;
        max = n - 1;
        while(min <= max){
            int mid = (min + max)/2;
            int realmid = (mid + rotation) % n;
            if(nums[realmid] == target) {return realmid;}
            if(nums[realmid] < target) {min = mid + 1;}
            else {max = mid - 1;}
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1}, 3));
    }
}