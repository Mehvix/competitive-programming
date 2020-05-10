package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    int cnt = 0;
    int countL = 0;
    int countR = 0;
    int goal = 0;
    ArrayList<Integer> candies = new ArrayList<>();
    boolean move = true; // true left, false right

    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();

        while (t--> 0){
            int n = fin.nextInt();

            for (int i = 0; i < n; i++) {
                candies.add(fin.nextInt());
            }

            int goal = candies.get(0);

            move(true);

            fout.println(cnt + " " + countL + " " + countR );
        }
    }

    private void move(boolean player) {
        int curCnt = 0;
        if (player) { // left
            curCnt += candies.get(0);
        } else {
            curCnt += candies.get(candies.size()-1);
        }
    }
}
