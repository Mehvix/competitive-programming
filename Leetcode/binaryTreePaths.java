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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> paths = new ArrayList<>();
        if (root==null) return paths;
        dfs(root, "", paths);
        return paths;
    }

    public void dfs(TreeNode root, String prev, ArrayList<String> paths){
        if(root.left == null && root.right == null) paths.add(((prev)+root.val));

        if(root.left != null) {
            dfs(root.left, prev + (root.val) + ("->"), paths);
        }
        if(root.right != null) {
            dfs(root.right, prev + (root.val) + ("->"), paths);
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}