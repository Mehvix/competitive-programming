package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_264A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                int a = fin.nextInt();
                if(a == 1){
                    fout.println(Math.abs(row-2) + Math.abs(col-2));
                }
            }
        }
    }
}
