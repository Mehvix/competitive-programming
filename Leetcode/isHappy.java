import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        List<Integer> visited = new ArrayList<>();
        while (n != 1){
            int j = 0;
            for (char i : String.valueOf(n).toCharArray()) {
                int calc = (int)Math.pow(Character.getNumericValue(i), 2);
                j += calc;
            }
            if (visited.indexOf(j) == -1) {
                visited.add(j);
                n = j;
            } else {
                break;
            }
        }
        if (n == 1){
            return true;
        }
        return false;
    }
}