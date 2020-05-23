import java.util.*;


class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] connections = new int[numCourses];

        for (int[] prerequisite : prerequisites) {
            connections[prerequisite[0]]++;
        }

        System.out.println(Arrays.toString(connections));

        Stack<Integer> que = new Stack<>();
        for (int i = 0; i < connections.length; i++) {
            if (connections[i] == 0) que.add(i);
        }

        int cnt = 0;
        while(!que.isEmpty()){
            System.out.println(Arrays.toString(connections) + " " + que + " " + cnt);
            int course = que.pop();
            cnt ++;
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == course){
                    // remove a prereq
                    connections[prerequisites[i][0]] --;
                    if(connections[prerequisites[i][0]] == 0){
                        que.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return cnt == numCourses;
    }



    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.canFinish(3, new int[][]{{1,0},{2,1}}));
    }
}