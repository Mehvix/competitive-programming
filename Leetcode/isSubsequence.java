import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;

        LinkedList<Character> que = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) que.add(s.charAt(i));

        char cur = que.pop();
        for (int i = 0; i < t.length(); i++) {
            char x = t.charAt(i);
            if (x == cur) {
                if (que.isEmpty()) return true;
                cur = que.pop();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
    }
}