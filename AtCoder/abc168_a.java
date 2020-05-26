package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc168_a {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int ones = fin.nextInt() % 10;
        if (ones == 3) fout.println("bon");
        else if (ones == 0 || ones == 1 || ones == 6 || ones == 8) fout.println("pon");
        else fout.println("hon");
    }
}
