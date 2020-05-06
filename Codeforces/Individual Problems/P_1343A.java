package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1343A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0){
            int n = fin.nextInt();

            for (int i = 2; i < 32; i++) {
                int div = (1 << i) - 1;
                if (n % div == 0){
                    fout.println(n/div);
                    break;
                }
            }
        }
    }
}
