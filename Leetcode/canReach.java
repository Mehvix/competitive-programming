import java.util.*;

class Solution {
    boolean[] visited;
    boolean ans = false;

    public boolean canReach(int[] arr, int start) {
        visited = new boolean[arr.length];
        bfs(arr, start);
        return ans;
    }

    public void bfs(int[] arr, int start){
        if (visited[start]) return;
        if (arr[start] == 0) {
            ans = true;
            return;
        }

        visited[start] = true;
        int val = arr[start];

//        System.out.println("Going from " + start + " to " + (start-val) + " & " + (start+val));
        if(start+val < arr.length && !visited[start+val]) {
            System.out.println("Going from " + start + " up to " + (start+val));
            bfs(arr, start+val);
        }

        if(start-val >= 0 && !visited[start-val]) {
            System.out.println("Going from " + start + " down to " + (start-val));
            bfs(arr, start-val);
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.canReach(new int[]{2,3,0,3,1,2}, 4));
    }
}