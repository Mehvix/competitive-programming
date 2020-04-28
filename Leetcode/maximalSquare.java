import java.util.*;

class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSize = 0;
//        int maxSize = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                while(!square(matrix, i, j, maxSize)){
                    maxSize ++;
                }
            }
        }
        return maxSize * maxSize;
    }

    private boolean square(char[][] matrix, int startI, int startJ, int size) {
        int rangeI = startI + size;
        int rangeJ = startJ + size;

        if (rangeI > matrix.length - 1 || rangeJ > matrix[0].length - 1){
            return false;
        }

        for (int i = startI; i <= rangeI; i++) {
            for (int j = startJ; j <= rangeJ; j++) {
                if (matrix[i][j] != '1'){
                    return false;
                }
            }
        }

        return true;
    }
}