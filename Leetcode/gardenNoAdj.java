import java.util.*;


class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] ans = new int[N];

        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(i, new HashSet<>());
        }

        for (int[] path : paths) {
            map.get(path[0]-1).add(path[1]-1);
            map.get(path[1]-1).add(path[0]-1);
        }


        for (int i = 0; i < N; i++) {
            boolean[] colors = new boolean[5];
            for (int j : map.get(i)) {
                colors[ans[j]] = true;  // mark color used
            }
            for (int c = 4; c > 0; --c) {
                if (!colors[c]) ans[i] = c;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.gardenNoAdj(3, new int[][]{{1, 2}, {2, 3}, {3, 1}})));
    }
}