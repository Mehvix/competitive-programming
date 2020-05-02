package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1256A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t > 0){
            t --;

            long cntN = fin.nextLong(); // number of nValue coins
            long cnt1 = fin.nextLong(); // number of 1 coins
            long nValue = fin.nextLong(); // value of nValue
            long goal = fin.nextLong(); // goal
//            cntN += cnt1 / nValue;
//            cnt1 = cnt1 % nValue;

            if (
                    (goal % nValue <= cnt1)  // we have enough 1's
                    && (cntN * nValue + cnt1 >= goal)){  // we can reach/surpass the goal
                fout.println("YES");
            } else {
                fout.println("NO");
            }
        }
    }
}
