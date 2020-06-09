import java.util.*;

class Solution {
    int[] coins;
    int n;
    int[][] cache;
    boolean[][] visited;

    public int change(int amount, int[] coins) {
        /*if (amount == 0) return 1;
        if (amount < 0 || coins.length == 0) return 0;
        return change(amount - coins[coins.length-1], coins) + change(amount, Arrays.copyOfRange(coins, 0, coins.length-1));*/

        this.coins = coins;
        this.n = coins.length;
        this.cache = new int[n+1][amount+1];
        this.visited = new boolean[n+1][amount+1];

        return dfs(amount, 0);
    }

    private int dfs(int amount, int i) {
        if (amount == 0) return 1;
        if (amount < 0) return 0;
        if (i == n) return 0;
        if (visited[i][amount]) return cache[i][amount];

        int total = 0;
        total += dfs(amount - coins[i], i);
        total += dfs(amount, i + 1);

        cache[i][amount] = total;
        visited[i][amount] = true;
        return total;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.change(5, new int[]{1,2,5}));
    }
}