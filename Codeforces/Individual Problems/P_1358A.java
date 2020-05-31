package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1358A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int m = fin.nextInt();
            int n = fin.nextInt();
            int min = Math.min(m,n);
            int max = Math.max(m,n);
            fout.println((int)((min * Math.floorDiv(max, 2)) + ((Math.ceil((double)max/2) - Math.floorDiv(max, 2)) * Math.floorDiv(min+1, 2))));
        }
    }
}
