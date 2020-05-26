package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1360A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int a = fin.nextInt();
            int b = fin.nextInt();
            if (Math.min(a, b) * 2 < Math.max(a, b)){
                fout.println(Math.max(a, b) * Math.max(a, b));
            } else {
                fout.println((Math.min(a, b) * 2) * (Math.min(a, b) * 2));
            }
        }
    }
}
