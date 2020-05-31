package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1360C {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();
            int[] arr = new int[n];

            int even = 0;
            int odd = 0;
            for (int i = 0; i < n; i++){
                int val = fin.nextInt();
                arr[i] = val;
                if (val % 2 == 0) even ++;
                else odd ++;
            }
            Arrays.sort(arr);

            if (odd % 2 == 0 && 0 == even % 2) fout.println("YES");
            else if (odd % 2 == 0 ^ even % 2 == 0) fout.println("NO");
            else {
                boolean a = true;
                for (int i = 0; i < n-1; i++) {
                    int i1 = arr[i];
                    int i2 = arr[i+1];
                    if (i2-i1 == 1) {
                        fout.println("YES");
                        a = false;
                        break;
                    }
                }
                if (a) fout.println("NO");
            }

        }
    }
}
