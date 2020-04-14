import java.util.*;

class Solution {
    public static String stringShift(String s, int[][] shift) {
        char[] arr = s.toCharArray();
        int sum_shift = 0;
        for (int[] i : shift){
            if (i[0] == 0) sum_shift -= i[1];
            else if (i[0] == 1) sum_shift += i[1];
        }
        // System.out.println(sum_shift);

        char temp = 0;
        int n = arr.length;
        if (sum_shift > 0){
            for (int x = 0; x < Math.abs(sum_shift); x ++) {
                temp = arr[n - 1];
                System.arraycopy(arr, 0, arr, 1, n - 1);
                arr[0] = temp;
            }
        } else {
            for (int x = 0; x < Math.abs(sum_shift); x ++) {
                int i;
                temp = arr[0];
                for (i = 0; i < n - 1; i++)
                    arr[i] = arr[i + 1];
                arr[i] = temp;
            }
        }
        // System.out.println(String.valueOf(arr));
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        //stringShift("abcdefg", new int[][]{{1,2}});
        stringShift("abcdefg", new int[][]{{1,1},{1,1},{0,2},{1,3}});
    }
}