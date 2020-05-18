package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1353A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();
            int m = fin.nextInt();

            if (n == 1){
                fout.println(0);
            } else if (n == 2){
                fout.println(m);
            } else {
                fout.println(2*m);
            }
        }
    }
}
