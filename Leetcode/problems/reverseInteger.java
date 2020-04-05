import java.util.*;

class Solution {
    public static int reverse(int x) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        long y = 0;
        boolean neg = false;
        if (x < 0){
            x *= -1;
            neg = true;
        }

        for (int i = String.valueOf(x).length() - 1; i != -1; i--) {
            long index = x % 10;
            x /= 10;
            y += (long)Math.pow(10, i) * index;
        }

        if (neg) {
            y *= -1;
        }

        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE){
            return 0;
        }
        return (int)y;
    }
}