package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1335A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();

            if (n <= 2){
                fout.println("0");
            } else {
                fout.println((n-1)/2);
            }
        }
    }
}
