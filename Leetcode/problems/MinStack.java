import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> arr = new ArrayList<>();

    /** initialize your data structure here. */
    public MinStack() {
        // todo haha this is bad but i'm behind on studying so come back later
    }

    public void push(int x) {
        if (arr.size() != 0){
            arr.add(arr.size(), x);
        } else {
            arr.add(x);
        }
    }

    public void pop() {
        arr.remove(arr.size()-1);
    }

    public int top() {
        return arr.get(0);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i : arr){
            if (i < min) min = i;
        }
        return min;
    }

    public String toString() {
        return arr.toString();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.toString());
        minStack.getMin();
        minStack.pop();
        System.out.println(minStack.toString());
        minStack.top();
        System.out.println(minStack.toString());
        System.out.println(minStack.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */