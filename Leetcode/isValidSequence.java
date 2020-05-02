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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        int n = arr.length;
        int depth = 0;
        return isValidSequence(root, arr, n, depth);
    }

    private boolean isValidSequence(TreeNode root, int[] arr, int n, int depth) {
        if (root == null){return false;}
        else if (depth == n){return false;}  // path is too long
        else if (root.val != arr[depth]){return false;}  // node doesn't  match arr
        else if (root.left == null && root.right == null && depth == n-1){return true;}  // leaf

        return (isValidSequence(root.left, arr, n, (depth + 1)) || isValidSequence(root.right, arr, n, (depth + 1)));
    }
}