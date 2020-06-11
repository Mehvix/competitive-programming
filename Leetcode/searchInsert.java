import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int x = Collections.binarySearch(Arrays.stream(nums).boxed().collect(Collectors.toList()), target);
        if (x < 0) x = -x - 1;
        return x;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.searchInsert(new int[]{1,3,5,6}, 5));
    }
}