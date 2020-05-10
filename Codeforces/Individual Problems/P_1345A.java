package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1345A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0) {
            int a = fin.nextInt();
            int b = fin.nextInt();

            if (a == 1 || b == 1){fout.println("YES");}
            else if (a == 2 && b == 2){fout.println("YES");}
            else {fout.println("NO");};
        }
    }
}
