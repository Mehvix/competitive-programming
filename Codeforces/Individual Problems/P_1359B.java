package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1359B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t-- > 0) {
            int n = fin.nextInt();  // height
            int m = fin.nextInt();  // width
            int x = fin.nextInt();  // 1x1
            int y = fin.nextInt();  // 1x2
            int cost = 0;
            boolean useOnlyX = (2 * x <= y);
            boolean[][] v = new boolean[n][m+1];

            for (int i = 0; i < n; i++) {
                String line = fin.next();
                for (int j = 0; j+1 < m; j++) {
                    char c1 = line.charAt(j);
                    char c2 = line.charAt(j + 1);
//                    System.out.println("looking at " + i + " " + j);;
                    if (!useOnlyX && c1 == '.' && c2 == '.') {
                        v[i][j] = true;
                        v[i][j + 1] = true;
//                        System.out.println(t + " adding pair at " + i + " " + j);
                        cost += y;
                        j++;
                    } else {
                        if (c1 == '.') {
                            v[i][j] = true;
//                            System.out.println(t + " adding single at " + i + " " + j);
                            cost += x;
                        }
                        /*if (c2 == '.') {
                            v[i][j + 1] = true;
                            System.out.println(t + " adding single at " + i + " " + (j + 1));
                            cost += x;
                            j++;
                        }*/
                    }
                }
                if ((line.length() >= 1) && !v[i][m-1] && line.charAt(m-1) == '.') {
//                    System.out.println(t + " adding last single at " + i + " " + (m-1));
                    cost += x;
                }
            }
            fout.println(cost);
        }
    }
}
