import java.util.*;

class LRUCache {
    private int n;
    private LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.n = capacity;
        this.map = new LinkedHashMap<>();
    }

    public int get(int key) {
        int value = -1;
        if(this.map.containsKey(key)){
            value = this.map.get(key);
            this.map.remove(key);
            this.map.put(key, value);
        }
        return value;
    }

    public void put(int key, int value) {
        if (this.map.containsKey(key)){
            this.map.remove(key);
        } else {
            if (this.map.size() == n) {
                Integer first = this.map.keySet().iterator().next();
                this.map.remove(first);
            }
        }

        this.map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */