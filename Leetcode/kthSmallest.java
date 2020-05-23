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
    int[] ans = new int[2];  // location, count

    public int kthSmallest(TreeNode root, int k) {
        ans[1] ++;
        search(root, k, ans);
        return ans[0];
    }


    private void search(TreeNode root, int k, int[] ans) {
        if(root == null) return;

        search(root.left, k, ans);
        if (ans[1] ++ == k){
            ans[0] = root.val;
            return;
        }

        search(root.right, k, ans);
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}