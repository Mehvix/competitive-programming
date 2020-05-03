import java.util.*;

class Solution {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {  // faster than char array
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)){count++;}
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }

}