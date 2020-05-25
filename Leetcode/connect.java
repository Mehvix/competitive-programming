import java.util.*;

/*class TreeNode {
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
}*/

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        Node node = root;
        while(node != null && node.left != null){
            recur(node);
            node = node.left;
        }
        return root;
    }

    private void recur(Node node){
        Node tmp = node;

        while(tmp != null){
            tmp.left.next = tmp.right;
            if(tmp.next != null){
                tmp.right.next = tmp.next.left;
            }
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}