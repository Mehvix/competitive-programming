package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc167_b {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int a = fin.nextInt();
        int b = fin.nextInt();
        int c = fin.nextInt();
        int k = fin.nextInt();

        int sum = 0;

        sum += Math.min(a, Math.max(k, 0));
        k -= a;
        k -= b;
        sum -= Math.min(c, Math.max(k, 0));

        fout.println(sum);
    }
}
