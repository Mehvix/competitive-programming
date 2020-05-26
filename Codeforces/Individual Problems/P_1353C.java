package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1353C {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        long[] valueCache = new long[(500000) + 1];

        for (long i = 1; i < 250000; i ++){
            int index = 1 + (int)i*2;
            valueCache[index] = valueCache[index-2] + 2*i*((2*i+1)+(2*i+1-2));
        }
        while(t-->0){
            fout.println(valueCache[fin.nextInt()]);
        }
    }
}
