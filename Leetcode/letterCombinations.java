import java.util.*;


class Solution {
    String[] arr;
    List<String> ans;

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        int nums = Integer.parseInt(digits);
        arr = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int[] combo = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            int x = nums % 10;
            nums /= 10;
            combo[i] = x;
        }


        // reverse array: https://stackoverflow.com/a/2137791/7833617
        for(int i = 0; i < combo.length / 2; i++){
            int temp = combo[i];
            combo[i] = combo[combo.length - i - 1];
            combo[combo.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(combo));

        dfs(combo, 0, new char[digits.length()]);

        return ans;
    }

    private void dfs(int[] combo, int i, char[] chars) {
        if (i == combo.length) ans.add(new String(chars));
        else {
            String word = arr[combo[i]];
            for (int k = 0; k < word.length(); k++) {
                char[] tmp = chars.clone();
                tmp[i] = word.charAt(k);

                dfs(combo, i + 1, tmp);
            }
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.letterCombinations("234").toString());

    }
}