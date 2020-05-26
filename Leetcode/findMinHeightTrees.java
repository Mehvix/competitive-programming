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
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        /*2 solutions:
         * 1.) Find the farthest node from any arbitrary point, then repeat again with the new node. This will be the
         * farthest. Find the middle (two) node(s)
         * 2.) Find all leafs, and remove all leaves until there are two or less*/

//        boolean[][] connections = new boolean[n][n];
        List<Set<Integer>> connections = new ArrayList<>(n);
        for (int i = 0; i < n; i++) connections.add(new HashSet<>());

        for (int[] b : edges) {
            int from = b[0];
            int to = b[1];

            connections.get(from).add(to);
            connections.get(to).add(from);
//            connections[from][to] = true;
//            connections[to][from] = true;
        }

        ArrayList<Integer> leafs = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if (connections.get(i).size() == 1) leafs.add(i);
        }

        System.out.println(connections);

        while (n > 2){
            n -= leafs.size();
            ArrayList<Integer> tmp = new ArrayList<>();

            for (int leaf : leafs) {
                int parent = connections.get(leaf).iterator().next();
                connections.get(parent).remove(leaf);
                if (connections.get(parent).size() == 1) tmp.add(parent);
            }
            leafs = tmp;
        }

        return leafs;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));
    }
}