import sun.plugin.javascript.navig.Array;

import java.util.*;

class Solution {
    int[] arr;
    int max;
    public Solution(int[] w) {
        arr = new int[w.length];
        max = 0;
        for (int i = 0; i < w.length; i++) {
            max += w[i];
            arr[i] = max;
        }

        System.out.println(Arrays.toString(arr));
    }

    public int pickIndex() {
        Random rand = new Random();
        int val = Arrays.binarySearch(arr, rand.nextInt(max)+1);
        if(val < 0) val = -val - 1;  // return -(low + 1);  // key not found.
        return val;
    }

    public static void main(String[] args) {
        Solution obj = new Solution(new int[]{3,14,1,7});
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
    }
}