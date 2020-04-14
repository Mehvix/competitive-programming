import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> fin = new HashMap<>();
        for (String str : strs) {
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String sortedStr = new String(cArr);

            if (!fin.containsKey(sortedStr)) fin.put(sortedStr, new ArrayList<>());
            fin.get(sortedStr).add(str);
        }
        return new ArrayList<List<String>>(fin.values());
    }
}