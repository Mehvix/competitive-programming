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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        ArrayList<List<Integer>> arr = new ArrayList<>();

        LinkedList<TreeNode> queNodes = new LinkedList<>();
        LinkedList<Integer> queLvl = new LinkedList<>();

        queNodes.add(root);
        queLvl.add(1);

        while(!queNodes.isEmpty()){
            TreeNode curNode = queNodes.pop();
            int curLvl = queLvl.pop();

            if(curNode == null) continue;
            if(arr.size() == curLvl){
                arr.get(arr.size()-1).add(curNode.val);  // check
            } else {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(curNode.val);
                arr.add(tmp);
            }

            queLvl.add(curLvl+1);
            queNodes.add(curNode.left);
            queLvl.add(curLvl+1);
            queNodes.add(curNode.right);
        }

        return arr;
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}