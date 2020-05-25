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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        LinkedList<TreeNode> queNodes = new LinkedList<>();
        LinkedList<Integer> queLvl = new LinkedList<>();
        queNodes.add(root);
        queLvl.add(1);

        while(!queNodes.isEmpty()){
            TreeNode curNode = queNodes.pop();
            int curLvl = queLvl.pop();
            if(curNode == null) continue;
            if (curNode.left == null && curNode.right == null) return curLvl;

            queLvl.add(curLvl+1);
            queNodes.add(curNode.left);
            queLvl.add(curLvl+1);
            queNodes.add(curNode.right);
        }

        return -1;  // should never be reached
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}