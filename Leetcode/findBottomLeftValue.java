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
    int minVal;
    int maxHeight;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return 0;  // test

        maxHeight = Integer.MIN_VALUE;
        minVal = -1;

        LinkedList<TreeNode> queNode = new LinkedList<>();
        LinkedList<Integer> queHeight = new LinkedList<>();
        queNode.add(root);
        queHeight.add(1);

        while(!queNode.isEmpty()){
            TreeNode node = queNode.pop();
            int height = queHeight.pop();
            if (node == null) continue;

            if(height > maxHeight) {
                maxHeight = height;
                minVal = node.val;
            }

            queNode.add(node.left);
            queHeight.add(height+1);
            queNode.add(node.right);
            queHeight.add(height+1);
        }

        return minVal;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}