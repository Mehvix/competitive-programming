import java.util.*;

class Solution {
    public static boolean isPerfectSquare(int num) {
        if (num == 1){return true;}
        //binary search
        long lo = 1;
        long mi;
        long hi = num/2;
        while (lo <= hi){
            mi = lo + (hi - lo) / 2;

            if (mi*mi == num){return true;}
            else if (mi*mi > num){hi = mi - 1;}
            else {lo = mi + 1;}
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
    }
}