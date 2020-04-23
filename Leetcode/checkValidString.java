import java.util.*;

class Solution {
    public static boolean checkValidString(String s) {

        /*
        for (char i : s.toCharArray()) {
            if (i == '(') {left++;}
            else if (i == ')') {right++;}
            else {stars ++;}
        }*/
        int count = 0;
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(') {
                leftStack.push(count);
            } else if (i == '*') {
                starStack.push(count);
            } else if (i == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!starStack.isEmpty()){
                    starStack.pop();
                } else {
                    return false;
                }
            }
            count ++;
        }

        while(!leftStack.isEmpty() && !starStack.isEmpty()){
            int i_left = leftStack.pop();
            int i_star = starStack.pop();

            if (i_star < i_left){
                return false;
            }
        }
        if (!leftStack.isEmpty()){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(*"));
    }
}