import java.util.*;

class Solution {
    boolean[][] visited;
    int[][] image;
    int originalColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.visited = new boolean[image.length][image[0].length];
        this.image = image;
        this.originalColor = image[sr][sc];

        fill(sr, sc, newColor);
        return this.image;
    }

    //dfs
    private void fill(int row, int col, int color) {
        if (visited[row][col]) {return;}
        visited[row][col] = true;

        if (image[row][col] == originalColor) {
            image[row][col] = color;}
        if (row - 1 >= 0)               {fill(row-1, col, color);}
        if (row + 1 < image.length)     {fill(row+1, col, color);}
        if (col - 1 >= 0)               {fill(row, col-1, color);}
        if (col + 1 < image[0].length)  {fill(row, col+1, color);}
    }
}

    public static void main(String[] args) {

    }
}