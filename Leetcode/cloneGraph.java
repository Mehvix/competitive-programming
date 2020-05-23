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
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

class Solution {
    /*HashMap<Integer, List<Node>> map = new HashMap<Integer, List<Node>>();*/
    HashMap<Node, Node> map = new HashMap<>();
    ArrayList<Integer> visited = new ArrayList<>();

    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        return recur(node);
    }

    public Node recur(Node node) {
        if(map.containsKey(node)) return map.get(node);

        Node cloned = new Node(node.val);
        map.put(node, cloned);

        for (Node neighbor : node.neighbors) {
            cloned.neighbors.add(recur(neighbor));
        }

        return cloned;
    }


/*    public void breakdown(Node node){
        int val = node.val;
        List<Node> neighbors = node.neighbors;

        map.put(val, neighbors);
        visited.add(val);

        int cnt = 0;
        for (Node curNode : neighbors) {
            if (!visited.contains(curNode.val)) {
                cnt++;
                breakdown(curNode);
            }
        }
    }*/

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}