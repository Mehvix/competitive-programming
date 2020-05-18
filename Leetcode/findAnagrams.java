import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> index = new ArrayList<>();
        if(s.length() == 0 || p.length() == 0 || s.length() < p.length()) return index;

        HashMap<Character, Integer> mapIter = new HashMap<>();
        HashMap<Character, Integer> mapCompare = new HashMap<>();

/*        if (s.length() < p.length()){
            String tempS = s;
            s = p;
            p = tempS;
        }*/

        for (int i = 0; i < p.length(); i++) {
            char x = s.charAt(i);
            mapIter.put(x,mapIter.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {
            char x = p.charAt(i);
            mapCompare.put(x,mapCompare.getOrDefault(x, 0) + 1);
        }

        if(mapCompare.equals(mapIter)) {
            index.add(0);
        }

        for (int i = 1; i < s.length()-p.length()+1; i++) {
            System.out.println(i + " " + mapIter);
            char xRemove = s.charAt(i-1);
            int xRVal = mapIter.get(xRemove);
            System.out.println(xRemove + " " + xRVal);

            if (xRVal > 1){
                mapIter.put(xRemove, xRVal-1);
            } else {
                mapIter.remove(xRemove);
            }

            char xNew = s.charAt(i+p.length()-1);
            mapIter.put(xNew,mapIter.getOrDefault(xNew, 0) + 1);

            if(mapCompare.equals(mapIter)) {
                index.add(i);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa").toString());
    }

}