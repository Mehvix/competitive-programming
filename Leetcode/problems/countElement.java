import java.util.*;

class Solution {
    public static int countElements(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();  // [value, occurances]
        int count = 0;
        int last_key = -2;  // because 0 is a possible value
        int last_value = -2;

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }


        // System.out.println(map);

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            int current_key = (int)pair.getKey();
            int current_value = (int)pair.getValue();
            // System.out.println(current_key + " = " + current_value);

            if (current_key == last_key + 1){
                count += last_value;
            }

            last_key = current_key;
            last_value = current_value;
            it.remove();
        }
        return count;
    }
}