import sun.awt.image.ImageWatched;

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
    List<List<Integer>> arr;

    public List<List<Integer>> levelOrder(Node root) {
        arr = new ArrayList<List<Integer>>();
        if (root == null) return arr;

        LinkedList<Node> queNode = new LinkedList<>();

        queNode.add(root);
        int i = 0 , size = 0;

        while(!queNode.isEmpty()){
            i = 0;
            size = queNode.size();
            ArrayList<Integer> temp = new ArrayList<>();

//            Doesn't use height que, instead (because bfs access each level iteratively) we can just add directly to a tmp array
            while(i < size) {
                Node node = queNode.pop();
                temp.add(node.val);
                for (Node child : node.children) {
                    queNode.add(child);
                }
                i++;
            }
            arr.add(temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}