import java.util.*;

class Solution {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer o1, Integer o2) -> (- Integer.compare(o1,o2)));

        for (int i : stones){
            maxHeap.add(i);
        }

        while (maxHeap.size() >= 2){
            int m1 = maxHeap.peek();
            maxHeap.remove();
            int m2 = maxHeap.peek();
            maxHeap.remove();

            int diff = m1 - m2;
            if (diff != 0){
                maxHeap.add(diff);
            }
        }
        if (maxHeap.size() != 0) {
            return maxHeap.peek();
        }
        return 0;
    }
}