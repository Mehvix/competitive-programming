import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    int maxDepth;
    public int maxDepth(Node root) {
        maxDepth = 0;
        dfs(root, 1);
        return maxDepth;
    }

    public void dfs(Node root, int lvl){
        if (root == null) return;
        if (lvl > maxDepth) maxDepth = lvl;

        for (Node child : root.children) {
            dfs(child, lvl+1);
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}