import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[n-i];
            s[n-i] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

    }
}