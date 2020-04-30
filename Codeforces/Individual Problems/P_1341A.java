package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1341A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();

        while (t > 0){
            t --;

            int n = fin.nextInt();
            int a = fin.nextInt();
            int b = fin.nextInt();
            int c = fin.nextInt();
            int d = fin.nextInt();

            int min = n * (a - b);
            int max = n * (a + b);

            if (min > (c + d) || max < (c - d)){
                fout.println("No");
            } else {
                fout.println("Yes");
            }
        }
    }
}
