import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] connections = new int[numCourses];
        int[] order = new int[numCourses];
        int cnt = 0;

        for (int[] prerequisite : prerequisites) {
            connections[prerequisite[0]]++;
        }

        Stack<Integer> que = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (connections[i] == 0) {
                order[cnt++] = i;
                que.add(i);
            }
        }

        while(!que.isEmpty()){
            int course = que.pop();
            for (int[] prereq : prerequisites) {
                if (prereq[1] == course) {
                    // remove a prereq
                    connections[prereq[0]]--;
                    if (connections[prereq[0]] == 0) {
                        order[cnt++] = prereq[0];
                        que.add(prereq[0]);
                    }
                }
            }
//            System.out.println(Arrays.toString(connections) + " " + que + " " + Arrays.toString(order));
        }

        if (cnt == numCourses) {
            return order;
        } else {
            return new int[0];
        }
    }



    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.findOrder(2, new int[][]{{1, 0}})));
    }
}