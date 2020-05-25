import sun.awt.image.ImageWatched;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        if (root == null) return arr;

        Stack<TreeNode> queNode1 = new Stack<>();
        Stack<TreeNode> queNode2 = new Stack<>();

        queNode1.add(root);

        while(!queNode1.isEmpty() || !queNode2.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<>();

            while(!queNode1.isEmpty()){
                TreeNode node = queNode1.pop();
                tmp.add(node.val);
                if(node.left!=null) queNode2.push(node.left);
                if(node.right!=null) queNode2.push(node.right);
            }

            arr.add(tmp);

            tmp=new ArrayList<Integer>();
            while(!queNode2.isEmpty())
            {
                TreeNode node = queNode2.pop();
                tmp.add(node.val);
                if(node.right!=null) queNode1.push(node.right);
                if(node.left!=null) queNode1.push(node.left);
            }
            if(!tmp.isEmpty()) arr.add(tmp);
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}