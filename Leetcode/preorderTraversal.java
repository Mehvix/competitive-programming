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
    ArrayList<Integer> arr;
    public List<Integer> preorderTraversal(TreeNode root) {
        arr = new ArrayList<>();
        dfs(root);

        return arr;
    }

    private void dfs(TreeNode node) {
        if(node == null) return;
        arr.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}