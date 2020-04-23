import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode base = new TreeNode(preorder[0]);
        stack.push(base);

        for (int i = 1; i < preorder.length; i++) {  // skip first number
            TreeNode node = new TreeNode(preorder[i]);
            if (preorder[i] < stack.peek().val) {
                stack.peek().left = node;
            } else {  // base.val > i
                TreeNode parent = stack.peek();
                while (!stack.isEmpty() && preorder[i] > stack.peek().val){
                    parent = stack.pop();
                }
                parent.right = node;
            }
            stack.push(node);
        }
        return base;
    }
}