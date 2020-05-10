package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t--> 0) {
            long n = fin.nextLong();
            long k = fin.nextLong();
            long tempK = k;

            while(true){
                long ans = k/n;
                if(((tempK + ans) / n) == ans){
                    fout.println(tempK + ans);
                    break;
                }
                k = tempK + ans;
            }
        }
    }
}
