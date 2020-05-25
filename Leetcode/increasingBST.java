import java.util.*;

public class TreeNode {
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
    TreeNode ans;
    TreeNode last;

    public TreeNode increasingBST(TreeNode root) {
        /*inorder traversal, add to list*/
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);

        if(ans == null) ans = root;
        else last.right = root;

        last = root;
        root.left = null;

        dfs(root.right);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

    }
}