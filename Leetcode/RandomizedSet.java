import java.util.*;

public class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> arr;
    Random rand;

    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        arr = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        boolean contained = map.containsKey(val);

        if (contained) return false;

        map.put(val, arr.size());
        arr.add(val);

        return true;
    }

    public boolean remove(int val) {
        boolean contained = map.containsKey(val);
        if(!contained) return false;

        int pos = map.get(val);

        if (pos < arr.size()-1){
            int lastVal = arr.get(arr.size()-1);

            arr.set(pos, lastVal);
            map.put(lastVal, pos);
        }

        arr.remove(arr.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }

}