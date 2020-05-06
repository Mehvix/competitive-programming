import java.util.*;

class Solution {
    /* Using 'fastHash' over 'hashMap' is twice as fast:
       - hashMap: https://leetcode.com/submissions/detail/334832957/
       - fastHash: https://leetcode.com/submissions/detail/334834261/
    */
    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
        int[] hashFast = new int[256];

        for (int i = s.length() - 1; i >= 0; i--) {
            char a = s.charAt(i);
//            int cnt = hashMap.getOrDefault(a, 0);
//            hashMap.put(a, cnt + 1);
            hashFast[a] ++;
        }
//        System.out.println(hashMap.toString());
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
//            if (hashMap.get(a) == 1){
            if (hashFast[a] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
    }
}