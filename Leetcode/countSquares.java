import java.util.*;

class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int x = Math.min(rows, cols) + 1;
        int cnt = 0;

        int[][] dp = new int[rows][cols];

        for (int r = 0; r < rows; r++) {  // row
            for (int c = 0; c < cols; c++) {  // col
                if (matrix[r][c] == 1) {
                    if (r == 0 || c == 0) {
                        dp[r][c] = 1;
                    } else {
                        dp[r][c] = Math.min(
                                Math.min(
                                        dp[r - 1][c],
                                        dp[r][c - 1]),
                                dp[r - 1][c - 1])
                                + 1;
                    }
                    cnt += dp[r][c];
                }
            }
                /*for (int s = 1; s < x; s++) {  // square size
//                    System.out.println("At " + r + " " + c + " and making square " + s + " to " + (r + s - 1) + " " + (c + s - 1));
                    boolean square = true;
                    for (int i = r; i < r + s; i++) {
                        if (i < rows && square) {
                            for (int j = c; j < c + s; j++) {
                                if (j < cols) {
//                                    System.out.println("Value at " + i + " " + j + ": " + matrix[i][j]);
                                    if (matrix[i][j] != 1){
                                        square = false;
                                        break;
                                    }
                                } else {
                                    square = false;
                                    break;
                                }
                            }
                        } else {
                            square = false;
                            break;
                        }
                    }
                    if(square) cnt ++;
                    }
                }
            }*/
        }
        return cnt;
    }
}