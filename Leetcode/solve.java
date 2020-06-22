import java.util.*;


class Solution {
    boolean[][] visited;
    char[][] board;
    int rows;
    int cols;

    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;
        this.visited = new boolean[board.length][board[0].length];
        this.board = board;
        this.rows = board.length;
        this.cols = board[0].length;

        for (int j = 1; j < cols - 1; j++) {
            if (board[0][j] == 'O') dfs(0, j);
            if (board[rows - 1][j] == 'O') dfs(rows - 1, j);
        }
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(i, 0);
            if (board[i][cols - 1] == 'O') dfs(i, cols - 1);
        }

        System.out.println(Arrays.deepToString(board));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '8') board[i][j] = 'O';
            }
        }
    }


    public void dfs(int row, int col){
        if (row < 0 || row > rows-1 || col < 0 || col > cols-1 || board[row][col] != 'O') return;
        this.board[row][col] = '8';
        dfs(row - 1, col);
        dfs(row + 1, col);
        dfs(row, col - 1);
        dfs(row, col + 1);

    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        Solution obj = new Solution();
        obj.solve(board);
        System.out.println(Arrays.deepToString(board));
    }


}
