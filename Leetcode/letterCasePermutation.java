import java.util.*;


class Solution {
    List<String> combos;

    public List<String> letterCasePermutation(String S) {
        combos = new ArrayList<>();

        dfs(S.toCharArray(), 0);
        return combos;
    }

    private void dfs(char[] S, int pos) {
        if (pos >= S.length) combos.add(new String(S));
        else {
            if (!Character.isDigit(S[pos])) {
                S[pos] = Character.toUpperCase(S[pos]);
                dfs(S, pos + 1);
                S[pos] = Character.toLowerCase(S[pos]);
                dfs(S, pos + 1);
            } else {
                dfs(S, pos + 1);
            }
        }
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.letterCasePermutation("a1b2").toString());
        System.out.println(obj.letterCasePermutation("3z4").toString());
        System.out.println(obj.letterCasePermutation("12345").toString());

    }
}