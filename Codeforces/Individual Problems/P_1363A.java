package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1363A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt(); // the length of the array
            int x = fin.nextInt(); // the number of elements you need to choose

            int e = 0;
            int o = 0;
            for (int i = 0; i < n; i++) {
                if (fin.nextInt() % 2 == 0) e ++;
                else o ++;
            }

            int maxO = Math.min(x, o);
            if (maxO%2==0 && maxO != 0) maxO -= 1;

            if (maxO <= 0 || x - maxO - e > 0) fout.println("No");
            else fout.println("Yes");
        }
    }
}
