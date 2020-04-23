import java.util.*;

class Solution {
    public static int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;

        int ROWS = grid.length;
        int COLS = grid[0].length;

        int[][] minArr = new int[ROWS][COLS];  // dp
        minArr[0][0] = grid[0][0];

        for (int row = 1; row < ROWS; row++) {minArr[row][0] = grid[row][0] + minArr[row-1][0];}
        for (int col = 1; col < COLS; col++) {minArr[0][col] = grid[0][col] + minArr[0][col-1];}
        System.out.println(Arrays.deepToString(minArr));
        for (int row = 1; row < ROWS; row++) {
            for (int col = 1; col < COLS; col++) {
                minArr[row][col] = grid[row][col] + Math.min(minArr[row-1][col], minArr[row][col-1]);
            }
        }

        return minArr[ROWS-1][COLS-1];
    }

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        }));
    }
}