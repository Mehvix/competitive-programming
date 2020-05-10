import java.util.*;

class Solution {
    public static int findJudge(int N, int[][] trust) {
        int[] possible = new int[N+1];
        boolean[] trusts = new boolean[N+1];
        for (int[] ints : trust) {
            int p1 = ints[0];
            int p2 = ints[1];
            trusts[p1] = true;
            possible[p2]++;
//            System.out.println(p1 + " " + p2);
//            System.out.println(Arrays.toString(possible));
//            System.out.println(Arrays.toString(trusts));
        }

        for (int i = 1; i < possible.length; i++){
            if (possible[i] == N-1 && !trusts[i]){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{{1,2}}));
        System.out.println(findJudge(3, new int[][]{{1,3}, {2, 3}}));
        System.out.println(findJudge(3, new int[][]{{1,3}, {2, 3}, {3,1}}));
        System.out.println(findJudge(3, new int[][]{{1,2}, {2, 3}}));
        System.out.println(findJudge(4, new int[][]{{1,3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));
    }
}