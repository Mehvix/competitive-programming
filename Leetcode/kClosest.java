import java.util.*;


class Solution {
    public int[][] kClosest(int[][] points, int K) {
        TreeMap<Integer, ArrayList<int[]>> map = new TreeMap<>();

        for (int[] point : points) {
            int dist = Math.abs((point[0] * point[0]) + (point[1] * point[1]));
            ArrayList<int[]> val = map.getOrDefault(dist, new ArrayList<int[]>());
            val.add(point);
            map.put(dist, val);
        }



        ArrayList<int[]> ans = new ArrayList<>();
        for (Integer key : map.keySet()) {
            for (int[] point : map.get(key)) {
                ans.add(point);
                if (ans.size() >= K) return ans.toArray(new int[0][]);
            }
        }

        return new int[K][K];
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.deepToString(obj.kClosest(new int[][]{{-5,4},{-6,-5},{4,6}}, 2)));
        System.out.println(Arrays.deepToString(obj.kClosest(new int[][]{{6,10},{-3,3},{-2,5},{0,2}}, 3)));

    }
}