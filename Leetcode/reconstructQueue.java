import sun.plugin.javascript.navig.Array;

import java.util.*;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] i, int[] j) {
                return i[0] == j[0] ? i[1] - j[1] : j[0] - i[0];
            }
        });

        ArrayList<int[]> lst = new ArrayList<>();

        for (int[] person : people) {
            lst.add(person[1], person);
        }

        return lst.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.deepToString(obj.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}})));
    }
}