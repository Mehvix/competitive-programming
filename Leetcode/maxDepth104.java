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
    int maxDepth;
    public int maxDepth(TreeNode root) {
        maxDepth = 0;
        dfs(root, 1);
        return maxDepth;
    }

    public void dfs(TreeNode root, int lvl){
        if (root == null) return;
        if (lvl > maxDepth) maxDepth = lvl;

        dfs(root.left, lvl+1);
        dfs(root.right, lvl+1);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}