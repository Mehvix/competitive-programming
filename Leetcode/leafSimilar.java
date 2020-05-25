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
    ArrayList<Integer> leafs1;
    ArrayList<Integer> leafs2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafs1 = new ArrayList<>();
        leafs2 = new ArrayList<>();

        dfs(root1, 1, 1);
        dfs(root2, 1, 2);

        System.out.println(leafs1.toString());
        System.out.println(leafs2.toString());
        return leafs1.equals(leafs2);
    }

    private void dfs(TreeNode root, int lvl, int set) {
        if (root == null) return;
        if (root.left == null && root.right == null){
            if (set == 1) leafs1.add(root.val);
            if (set == 2) leafs2.add(root.val);
        }

        dfs(root.left, lvl + 1, set);
        dfs(root.right, lvl + 1, set);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}