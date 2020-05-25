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
    public boolean isSymmetric(TreeNode root) {
        ans = true;
        if (root == null) return true;

        recur(root.left, root.right);

        return ans;
    }

    public void recur(TreeNode left, TreeNode right){
        /*^ means xor and is basically "one or the other, not both or neither"*/
        if (((left == null) ^ (right == null)) || ((right != null && left != null) && (left.val != right.val))){
            ans = false;
            return;
        }

        if (left != null && right != null) {
            recur(left.left, right.right);
            recur(left.right, right.left);
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}