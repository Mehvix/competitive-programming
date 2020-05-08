package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_32B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        // 0 = .
        // 1 = -.
        // 2 = --

        StringBuilder ans = new StringBuilder();
        boolean open = false;
        char[] chars = fin.nextLine().toCharArray();

        for (char a : chars) {
            if (a == '.') {
                if (open) {
                    ans.append(1);
                } else {
                    ans.append(0);
                }
                open = false;
            } else {  // -
                if (open) {
                    ans.append("2");
                    open = false;
                } else {open = true;}
            }
        }
        fout.println(ans.toString());

    }
}
