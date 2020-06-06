package codeforces;

import java.util.Scanner;
import java.io.PrintWriter;

public class P_1355A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            long a = fin.nextLong();
            long k = fin.nextLong() - 1;
            while (k-->0){
                long y = recur(a);
                if (y==0) break;
                a += y;
            }
            fout.println(a);
        }
    }

    private long recur(long a) {
        long min = 10;
        long max = 0;
        while(a > 0){
            long val = a % 10;
            a /= 10;
            if (val > max) max = val;
            if (val < min) min = val;
        }

        return min * max;
    }
}
