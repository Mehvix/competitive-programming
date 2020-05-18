import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // This is incredibly similar to findAnagrams

        if(s1.length() == 0 || s2.length() == 0 || s1.length() > s2.length()) return false;

        HashMap<Character, Integer> mapIter = new HashMap<>();
        HashMap<Character, Integer> mapCompare = new HashMap<>();


        for (int i = 0; i < s1.length(); i++) {
            char x = s2.charAt(i);
            mapIter.put(x,mapIter.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            mapCompare.put(x,mapCompare.getOrDefault(x, 0) + 1);
        }

        if(mapCompare.equals(mapIter)) {
            return true;
        }

        for (int i = 1; i < s2.length()-s1.length()+1; i++) {
//            System.out.println(i + " " + mapIter);
            char xRemove = s2.charAt(i-1);
            int xRVal = mapIter.get(xRemove);
//            System.out.println(xRemove + " " + xRVal);

            if (xRVal > 1){
                mapIter.put(xRemove, xRVal-1);
            } else {
                mapIter.remove(xRemove);
            }

            char xNew = s2.charAt(i+s1.length()-1);
            mapIter.put(xNew,mapIter.getOrDefault(xNew, 0) + 1);

            if(mapCompare.equals(mapIter)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.checkInclusion("ba", "eidboaoo"));
    }

}