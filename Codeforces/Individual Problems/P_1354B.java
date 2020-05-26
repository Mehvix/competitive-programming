package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1354B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
//            System.out.println("---");
            int i1 = -1;
            int i2 = -1;
            int i3 = -1;

            String str = fin.next();
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < str.length(); i++){
                char x = str.charAt(i);
                if (x == '1') {
                    i1 = i;
                    if (i2 != -1 && i3 != -1) min = Math.min(min, i1 - Math.min(i2, i3)+1);
                } else if (x == '2') {
                    i2 = i;
                    if (i1 != -1 && i3 != -1) min = Math.min(min, i2 - Math.min(i1, i3)+1);
                } else {
                    i3 = i;
                    if (i1 != -1 && i2 != -1) min = Math.min(min, i3 - Math.min(i1, i2)+1);
                }
            }
            if (min == Integer.MAX_VALUE) System.out.println(0);
            else System.out.println(min);
        }
    }
}
