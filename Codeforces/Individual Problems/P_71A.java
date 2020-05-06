package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_71A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt() + 1;
        while (t -- > 0){
            String word = fin.nextLine();
            int n = word.length();
            if (n > 10){
                fout.println("" + word.charAt(0) + (n - 2) + word.charAt(n-1));
            } else {
                fout.println(word);
            }
        }
    }
}
