package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();

        while(t -- > 0){
            int n = fin.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            while (true){
                String str = String.valueOf(n);
                int value = (int) Math.pow(10, str.length()-1);
                ans.add(n/value*value);
                n = n % value;
                if (n == 0){
                    break;
                }
            }
            fout.println(ans.size());
            for (Integer an : ans) {
                fout.print(an + " ");
            }
            fout.println();
        }

    }

}
