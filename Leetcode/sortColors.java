import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int pos = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            for (int i = 0; i < entry.getValue(); i++) {
                nums[pos] = x;
                pos ++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.sortColors(new int[]{2,0,2,1,1,0});
    }
}