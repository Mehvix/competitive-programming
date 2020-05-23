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
    public int maxLevelSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();  // level, sum
        recur(root, map, 1);

        Map.Entry<Integer, Integer> max = null;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;
            }
        }

        return max.getKey();
    }

    public void recur(TreeNode root, HashMap<Integer, Integer> map, int level){
        if (root == null) return;
        map.put(level, map.getOrDefault(level, 0) + root.val);

        recur(root.left, map, level + 1);
        recur(root.right, map, level + 1);
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}