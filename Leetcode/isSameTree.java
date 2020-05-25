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
    ArrayList<Integer> pValues;
    ArrayList<Integer> qValues;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        pValues = new ArrayList<>();
        qValues = new ArrayList<>();

        dfs(p, true);
        dfs(q, false);

        return pValues.equals(qValues);
    }

    public void dfs(TreeNode root, boolean set){
        int val;
        if (root == null) val = Integer.MAX_VALUE;
        else val = root.val;

        if(set){  // q
            pValues.add(val);
        } else {
            qValues.add(val);
        }

        if (val != Integer.MAX_VALUE) {
            dfs(root.left, set);
            dfs(root.right, set);
        }
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}