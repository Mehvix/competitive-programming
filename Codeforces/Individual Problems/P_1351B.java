package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1351B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int a1 = fin.nextInt();
            int b1 = fin.nextInt();
            int a2 = fin.nextInt();
            int b2 = fin.nextInt();

            if (b1 == a2 && a1 + b2 == b1) {fout.println("Yes");}
            else if (a1 == a2 && b1 + b2 == a1) {fout.println("Yes");}
            else if (a1 == b2 && b1 + a2 == a1) {fout.println("Yes");}
            else if (b1 == b2 && a1 + a2 == b1) {fout.println("Yes");}
            else                                {fout.println("No");}
        }
    }
}
