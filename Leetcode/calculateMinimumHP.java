import java.util.*;

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int rows = dungeon.length;
        int cols = dungeon[0].length;
        int[][] dp = new int[rows+1][cols+1];

        for (int i = 0; i <= rows; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);

        dp[rows][cols-1] = 1;
        dp[rows-1][cols] = 1;

        for (int i = rows-1; i >= 0; i--){
            for (int j = cols-1; j >= 0; j--){
                int min = Math.min(dp[i+1][j], dp[i][j+1]) - dungeon[i][j];
                dp[i][j] = min < 1 ? 1 : min;
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }


}
