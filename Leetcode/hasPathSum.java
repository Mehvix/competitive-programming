import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    boolean ans;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        ans = false;
        dfs(root, 0, sum);
        return ans;
    }

    private void dfs(TreeNode root, int sum, int goal) {
        if (root == null) return;
        if (root.left == null && root.right == null){
            if(sum+root.val == goal){
                ans = true;
            }
            return;
        }

        dfs(root.left, sum+root.val, goal);
        dfs(root.right, sum+root.val, goal);
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}