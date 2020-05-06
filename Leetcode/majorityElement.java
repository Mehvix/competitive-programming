import java.util.*;

class Solution {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;
        int maxElement = -1;
        for (int num : nums) {
            int value = hashMap.getOrDefault(num, 0) + 1;
            hashMap.put(num, value);
            if (value > max){
                max = value;
                maxElement = num;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}