import java.util.*;

class Solution {
    int[][] visited;
    int[] A;
    int[] B;

    public int maxUncrossedLines(int[] A, int[] B) {
        this.A = A;
        this.B = B;
        visited = new int[A.length][B.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                visited[i][j] = -1;
            }
        }

        return recur(0,0);
    }

    private int recur(int APointer, int BPointer) {
        if (APointer == A.length || BPointer == B.length) return 0;
        if (visited[APointer][BPointer] >= 0) return visited[APointer][BPointer];

        int best = 0;
        if(A[APointer] == B[BPointer]) best = Math.max(best, recur(APointer+1, BPointer+1)+1);
        best = Math.max(best, recur(APointer, BPointer+1));
        best = Math.max(best, recur(APointer+1, BPointer));

        visited[APointer][BPointer] = best;
        return best;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}