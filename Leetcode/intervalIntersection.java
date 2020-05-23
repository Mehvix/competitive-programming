import java.util.*;


class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if (A.length == 0 || B.length == 0) return new int[][]{};
        int pointA = 0;
        int pointB = 0;
        ArrayList<int[]> arr = new ArrayList<>();

        while (true){
            if(A[pointA][1] >= B[pointB][0] && (A[pointA][0] <= B[pointB][1])) {

                arr.add(new int[]{Math.max(A[pointA][0], B[pointB][0]), Math.min(A[pointA][1], B[pointB][1])});

            }

            if(A[pointA][1] > B[pointB][1]){  // A is too far
                if (pointB < B.length-1){
                    pointB ++;
                } else {
                    if (pointA < A.length-1) {
                        pointA++;
                    } else {
                        break;
                    }
                }
            } else /*if (A[pointA][0] < B[pointB][1])*/ {  // B is too far
                if (pointA < A.length-1){
                    pointA ++;
                } else {
                    if (pointB < B.length-1){
                        pointB ++;
                    } else {
                        break;
                    }
                }
            }
        }

        int[][] fin = new int[arr.size()][2];

        for (int i = 0; i < fin.length; i++) {
            fin[i] = arr.get(i);
        }

//        System.out.println(Arrays.deepToString(fin));
        return fin;
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}}, new int[][]{{1,5},{8,12},{15,24},{25,26}});
    }
}