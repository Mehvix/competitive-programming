import java.util.*;

class Solution {
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        if (n == k) return "0";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (k>0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
//            System.out.println(stack.toString());
        }

        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }

//        return String.valueOf(Integer.valueOf(sb.toString()));
        int end = -1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                end = i;
                break;
            }
        }
        if (end == -1) return "0";
        return sb.toString().substring(end);
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
        System.out.println(removeKdigits("10200", 1));
        System.out.println(removeKdigits("10", 2));
        System.out.println(removeKdigits("112", 1));
        System.out.println(removeKdigits("100", 1));

    }
}