import java.util.*;

class Solution {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dpArr = new int[text1.length() + 1][text2.length() + 1];

        char[] text1Chars = text1.toCharArray();
        char[] text2Chars = text2.toCharArray();

        for (int i = 0; i < text1Chars.length; i++) {
            char text1Char = text1Chars[i];

            for (int j = 0; j < text2Chars.length; j++) {
                char text2Char = text2Chars[j];

                if (text1Char == text2Char){dpArr[i + 1][j + 1] = dpArr[i][j] + 1;}
                else {dpArr[i + 1][j + 1] = Math.max(dpArr[i][j + 1], dpArr[i + 1][j]);}
            }
        }
        System.out.println(Arrays.deepToString(dpArr));
        return dpArr[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        longestCommonSubsequence("abc", "bcde");
    }
}