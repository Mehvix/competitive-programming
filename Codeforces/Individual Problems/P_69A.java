package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_69A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int i = 0;
        int j = 0;
        int k = 0;

        int n = fin.nextInt();
        for (int a = 0; a < n; a++) {
            i += fin.nextInt();
            j += fin.nextInt();
            k += fin.nextInt();
        }

        if ((i == 0 && j == 0 && k == 0)) {
            fout.println("YES");
        } else {
            fout.println("NO");
        }

    }
}
