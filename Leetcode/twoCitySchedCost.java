import java.util.*;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        /*Steps
         * 1. Sort by largest to smallest difference between numbers
         * 2. Add min of 2 nums to smaller list until a list if full or we run out of nums*/
        int n = costs.length/2;
        int ans = 0;

        List<int[]> arr = Arrays.asList(costs);
        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Math.abs(o2[0]-o2[1]) - Math.abs(o1[0]-o1[1]);
            }
        });

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int[] value : arr) {
            int i0 = value[0];
            int i1 = value[1];

            if ((i0 > i1 && b.size() != n) || a.size() == n) {
                b.add(i1);
                ans += i1;
            } else {
                a.add(i0);
                ans += i0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.twoCitySchedCost(new int[][]{{10,20},{30,200},{400,50},{30,20}}));
    }
}