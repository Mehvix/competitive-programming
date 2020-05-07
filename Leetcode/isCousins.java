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
    private int xDepth = -1;
    private int yDepth = -1;
    private TreeNode xParent = new TreeNode();
    private TreeNode yParent = new TreeNode();

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        solve(root, x, y, 0, null);
        return xDepth == yDepth && yParent != xParent;
    }

    public void solve(TreeNode root, int x, int y, int depth, TreeNode parent){
        if (root == null) return;

        if (root.val == x){
            xDepth = depth;
            xParent = parent;
        }
        if (root.val == y){
            yDepth = depth;
            yParent = parent;
        }

        solve(parent.left, x, y, depth + 1, root);
        solve(parent.right, x, y, depth + 1, root);
    }
}