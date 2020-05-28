package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc167_a {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        String s = fin.next();
        String t = fin.next();


        if(t.substring(0, t.length()-1).equals(s)) {
            fout.println("Yes");
        } else {
            fout.println("No");
        }
    }
}
