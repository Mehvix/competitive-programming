package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1335B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        while(t-->0){
            int n = fin.nextInt();
            int a = fin.nextInt();
            int b = fin.nextInt();

            for (int i = 0; i < n/b; i++) {
                for (int j = 0; j < b; j++) {
                    fout.print(alphabet[j]);
                }
            }

            for (int i = 0; i < n%b; i++) {
                fout.print(alphabet[i]);
            }

            fout.print("\n");
        }
    }
}
