package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskE {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();

        while (t--> 0) {
            int n = fin.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> sum = new ArrayList<>();
            int last = 0;

            for (int i = 0; i < n; i++) {
                int x = fin.nextInt();
                arr.add(x);

                last += x;
                sum.add(last);
            }

//            System.out.println(sum.toString());
//            System.out.println(arr.toString());

            Set<Integer> combos = new HashSet<>();
            for (int i = 0; i < sum.size()-1; i++) {
                for (int j = i+1; j < sum.size(); j++) {
                    int comboSum = Math.abs(sum.get(j) - sum.get(i));
                    combos.add(comboSum);
                }
            }
            System.out.println(combos.toString());
        }
    }
}
