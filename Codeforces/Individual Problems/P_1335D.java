package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1335D {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0) {
            for (int i = 0; i < 9; i++) {
                String input = fin.next();
                System.out.println(input.replace('2', '3'));
            }
        }
    }
}
