package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1353B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();
            int k = fin.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++){
                a.add(fin.nextInt());
                Collections.sort(a);
            }

            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++){
                b.add(fin.nextInt());
                Collections.sort(b);
            }
            while (k-->0){
                if (a.get(0) >= b.get(n-1)) break;
                b.add(0, a.get(0));
                a.remove(0);
                a.add(n-1,b.get(n));  // n because we're adding a[0]
                b.remove(n);  // n because we're adding a[0]
//                System.out.println("a " + a.toString());
//                System.out.println("b " + b.toString());
            }

            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            fout.println(sum);
        }
    }
}
