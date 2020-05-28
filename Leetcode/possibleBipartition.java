import java.util.*;


class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < N; i++) adj.add(new ArrayList<>());

        for (int[] dislike : dislikes) {
            adj.get(dislike[0] - 1).add(dislike[1] - 1);
            adj.get(dislike[1] - 1).add(dislike[0] - 1);
        }

        System.out.println(adj.toString());

        int[] group = new int[N];
        Arrays.fill(group, -1);
        group[0] = 0;

        LinkedList<Integer> que = new LinkedList<>();
        que.add(0);

        while(!que.isEmpty()){
            int i = que.pop();
            ArrayList<Integer> edgeLst = adj.get(i);

            int opp;
            if (group[i] == 0) opp = 1;
            else opp = 0;

            for (int edge : edgeLst) {
                if (group[edge] == -1) group[edge] = opp;
                else if (group[edge] == opp) continue;
                else return false;
                que.add(edge);
            }

            if(que.isEmpty()){
                for (int j = 0; j < group.length; j++) {
                    if(group[j] == -1) {
                        que.add(j);
                        group[j] = 0;
                        break;
                    }
                }
            }

//            System.out.println(Arrays.toString(group));
        }

        return true;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.possibleBipartition(4, new int[][]{{1,2},{1,3},{2,4}}));//t
        System.out.println(obj.possibleBipartition(3, new int[][]{{1,2},{1,3},{2,3}}));//f
        System.out.println(obj.possibleBipartition(5, new int[][]{{1,2},{3,4},{4,5},{3,5}}));//f
        System.out.println(obj.possibleBipartition(5, new int[][]{{1,2},{2,3},{3,4},{4,5},{1,5}}));//f
        System.out.println(obj.possibleBipartition(10, new int[][]{{5,9},{5,10},{5,6},{5,7},{1,5},{4,5},{2,5},{5,8},{3,5}}));//t
    }
}