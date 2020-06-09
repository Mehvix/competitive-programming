import java.util.*;

class Solution {
    public boolean isPowerOfTwo(int n) {
        int x = -1;
        int res = 0;
        while(true){
            res = 2 << x;  // 2 ^ x
            if (x == -1) res += 1;

            System.out.println(x + " " + res);
            if (res >= n || x == 31) break;
            x ++;
        }

        return res == n;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isPowerOfTwo(1073741825));
    }
}