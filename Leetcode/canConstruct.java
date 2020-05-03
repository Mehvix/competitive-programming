import java.util.*;

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapMagazine = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            mapMagazine.put(m, mapMagazine.getOrDefault(m, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int cnt = mapMagazine.getOrDefault(r, -1);
            if  (cnt >= 1){
                mapMagazine.put(r, cnt - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}