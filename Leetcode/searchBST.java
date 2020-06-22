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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            TreeNode cur = que.poll();
            if (cur != null) {
                if (cur.val == val) return cur;
                que.add(cur.left);
                que.add(cur.right);
            }
        }

        return null;
    }
}
