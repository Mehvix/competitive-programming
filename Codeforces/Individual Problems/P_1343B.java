package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1343B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0){
            int n = fin.nextInt();
            if (n % 4 == 0){
                fout.println("YES");
                int cnt = n / 4;
                int even = 2;
                for (int i = 0; i < n/2; i++) {
                    fout.print(even + " ");
                    even += 2;
                }
                int odd = 1;
                for (int i = 0; i < n/2-1; i++) {
                    fout.print(odd + " ");
                    odd += 2;
                }
                fout.println(odd + n/2);
            } else {
                fout.println("NO");
            }
        }
    }
}
