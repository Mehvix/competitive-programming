package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1330B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0){
            int n = fin.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            int max = 0;

            for (int i = 0; i < n; i++) {
                int val = fin.nextInt();
                nums.add(val);
                if(val > max){
                    max = val;
                }
            }
            int min = n - max;

//            System.out.println("---");
//            System.out.println(nums.toString());

            List<Integer> case1_1 = nums.subList(0, min);  // shorter
            List<Integer> case1_2 = nums.subList(min, n);  // longer

            List<Integer> case2_1 = nums.subList(0, max);  // shorter
            List<Integer> case2_2 = nums.subList(max, n);  // longer

            boolean case1 = check(case1_1, case1_2);
            boolean case2 = check(case2_2, case2_1);

            if(case1 && case2){
                fout.println(2);
                fout.println(min + " " + max);
                fout.println(max + " " + min);
            } else if (case1) {
                fout.println(1);
                fout.println(min + " " + max);
            } else if (case2) {
                fout.println(1);
                fout.println(max + " " + min);
            } else {
                fout.println(0);
            }
        }
    }

    public static boolean check(List<Integer> c1, List<Integer> c2){
        int c1size = c1.size();
        int[] cnt1 = new int[c1size+1];
        for (Integer i : c1) {
            if (i > c1size || cnt1[i] == 1){
                return false;
            }
            cnt1[i] = 1;
        }

        int c2size = c2.size();
        int[] cnt2 = new int[c2size+1];
        for (Integer i : c2) {
            if (i > c2size || cnt2[i] == 1){
                return false;
            }
            cnt2[i] = 1;
        }
        return true;
    }
}
