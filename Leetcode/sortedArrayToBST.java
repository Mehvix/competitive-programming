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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length ==  0) return null;

        return createBST(nums, 0, nums.length-1);

    }

    private TreeNode createBST(int[] nums, int lo, int hi) {
        if(lo > hi) return null;
        int mid = lo + (hi-lo)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, lo, mid-1);
        root.right = createBST(nums, mid+1, hi);
        return root;
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}