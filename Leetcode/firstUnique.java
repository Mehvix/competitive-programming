import java.util.*;

class FirstUnique {
    private Map<Integer, Integer> map;
    private Queue<Integer> que;

    public FirstUnique(int[] nums) {
        map = new HashMap<>();
        que = new LinkedList<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int showFirstUnique() {
        while(!que.isEmpty()){
            int current = que.peek();
            if (map.get(current) == 1){
                return current;
            }
            que.poll();
        }
        return -1;
    }

    public void add(int value) {
        int cnt = map.getOrDefault(value, 0);
        if(cnt <= 1){
            que.offer(value);
        }
        map.put(value, cnt + 1);

        System.out.println(map.toString());
    }

    public static void main(String[] args) {
        FirstUnique firstUnique = new FirstUnique(new int[]{2, 3, 5});
        System.out.println(firstUnique.showFirstUnique()); // return 2
        firstUnique.add(5);            // the queue is now [2,3,5,5]
        System.out.println(firstUnique.showFirstUnique()); // return 2
        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        System.out.println(firstUnique.showFirstUnique()); // return 3
        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        System.out.println(firstUnique.showFirstUnique()); // return -1

    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */