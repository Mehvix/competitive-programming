package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1354A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            long a = fin.nextInt();  // the time Polycarp has to sleep for to feel refreshed
            long b = fin.nextInt();  // the time before the first alarm goes off
            long c = fin.nextInt();  // the time before every succeeding alarm goes off
            long d = fin.nextInt();  // the time Polycarp spends to fall asleep

            if (a <= b) fout.println(b);  // gets all sleep first night
            else if (d >= c) fout.println(-1);  // can't get additional sleep
            else {
                long tmpA = a - b;
                long blocks = (int)(tmpA + (c - d - 1)) / (c - d);  // math.ceil was giving me floating-point errors, but this works to ceil
//                fout.println(blocks);
                fout.println(b + blocks * c);
            }
        }
    }
}
