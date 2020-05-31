package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1343C {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
    int t = fin.nextInt();
    while(t-->0){
        int n = fin.nextInt();
        long ans = 0;
        long cur = fin.nextLong();
        for (int i = 0; i < n-1; i++) {
            long x = fin.nextLong();
            if(x < 0 ^ cur < 0){  // ^ means one or the other, but not both or neither
                ans += cur;
                cur = x;
            } else {
                cur = Math.max(x, cur);
            }
        }
        ans += cur;
        fout.println(ans);
    }
    }
}
