package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc168_b {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int k = fin.nextInt();
        String s = fin.next();
        if (s.length() <= k) fout.println(s);
        else fout.println(s.substring(0, k) + "...");
    }
}
