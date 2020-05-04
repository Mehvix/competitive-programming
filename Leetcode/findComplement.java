import java.util.*;

class Solution {
    public static int findComplement(int num) {
        char[] bin = Integer.toBinaryString(num).toCharArray();
//        System.out.println(Arrays.toString(bin));
        String fin = "";
        for (int i = 0; i < bin.length; i++) {
            int val = Integer.parseInt(String.valueOf(bin[i]));
            val = ((val == 0) ? 1 : 0);
            fin += val;
        }
//        System.out.println("---\n" + fin);
        return (Integer.parseInt(String.valueOf(fin), 2));
    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}