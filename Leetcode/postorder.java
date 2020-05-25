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
    ArrayList<Integer> arr;
    public List<Integer> postorder(Node root) {
        arr = new ArrayList<>();
        dfs(root);

        return arr;
    }

    private void dfs(Node node) {
        if (node == null) return;

        for (Node child : node.children) {
            dfs(child);
        }
        arr.add(node.val);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}