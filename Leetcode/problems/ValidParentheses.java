import java.util.*;


class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                st.push(i);
            } else if (i == ')') {
                if (st.isEmpty() || st.pop() != '(')
                    return false;
            } else if (i == '}') {
                if (st.isEmpty() || st.pop() != '{')
                    return false;
            } else {
                if (st.isEmpty() || st.pop() != '[')
                    return false;
            }
        }
        if (st.isEmpty())
            return true;
        return false;
    }
}