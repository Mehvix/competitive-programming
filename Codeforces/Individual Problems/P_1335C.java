package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1335C {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();

            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int j = fin.nextInt();
                int value = hashMap.getOrDefault(j, 0) + 1;
                hashMap.put(j, value);
                if (value > max) max = value;
            }
            int d = hashMap.size();
            fout.println(Math.max(Math.min(d - 1, max), Math.min(d, max - 1)));
        }
    }
}
