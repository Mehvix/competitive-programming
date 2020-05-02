// https://leetcode.com/contest/weekly-contest-186/problems/maximum-score-after-splitting-a-string/

import java.util.*;

class Solution {
    public static int maxScore(String s) {
        int max = 0;
        char[] arr = s.toCharArray();
        int l = 0;
        int r = 0;

        if (arr[0] == '0'){l = 1;}

        for (int i = 1; i < arr.length; i++) {
            int c = arr[i];
            if (c == '1'){r++;}
        }

        int sum = l + r;
        if (sum > max){max = sum;}

//        System.out.println("Score w 0: " + l + " " + r);
        for (int i = 1; i < arr.length - 1; i++) {
            char c = arr[i];

            if (c == '1'){r --;} else {l ++;}

            sum = l + r;
            if (sum > max){max = sum;}
//            System.out.println("Score w " + i + ": " + l + " " + r);
        }

        return max;
    }
}