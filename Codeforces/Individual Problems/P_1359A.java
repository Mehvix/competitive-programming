package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1359A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();  // cards
            int m = fin.nextInt();  // jokers
            int k = fin.nextInt();  // players
            int cardsPerPlayer = n/k;

            if (m <= cardsPerPlayer) fout.println(m);
            else {
                fout.println(cardsPerPlayer - (int)Math.ceil(((double)m-cardsPerPlayer)/(k-1)));
            }
        }
    }
}
