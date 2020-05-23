import java.util.*;


class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Character> [] order = new List[s.length() + 1];
        for (char x : map.keySet()) {
            int cnt = map.get(x);
            if (order[cnt] == null) {
                order[cnt] = new ArrayList<>();
            }
            order[cnt].add(x);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = order.length - 1; i >= 0; i--) {
            if (order[i] != null) {
                for (char x : order[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(x);
                    }
                }
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.frequencySort("adAbDDDd"));
    }
}