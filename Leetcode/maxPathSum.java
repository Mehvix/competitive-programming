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
    int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        findMax(root);
        return maxValue;
    }

    private int findMax(TreeNode node) {
        if (node == null){return 0;}
        int l = Math.max(0, findMax(node.left));
        int r = Math.max(0, findMax(node.right));
        int value = node.val;
        maxValue = Math.max(maxValue, l + r + value);
        return Math.max(l, r) + value;
    }
}