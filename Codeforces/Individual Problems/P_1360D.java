package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1360D {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();
            int k = fin.nextInt();

            if (k >= n) fout.println(1);
            else {
                int incrementer = n % 2 == 0 ? 1 : 2;
                int max = 1;
                for (int i = n % 2 == 0 ? 2 : 3; i <= Math.sqrt(n); i += incrementer) {
                    if (n % i == 0) {
                        if(i <= k) max = Math.max(max, i);
                        if(n / i <= k) max = Math.max(max, n / i);
                    }
                }
                fout.println(n/max);
            }
        }
    }
}
