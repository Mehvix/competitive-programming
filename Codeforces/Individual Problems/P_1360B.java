package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1360B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0; i < n; i ++) {
                arr.add(fin.nextInt());
                Collections.sort(arr);
            }

//            fout.println(arr.get(n/2)-arr.get(n/2-1));
            int mindiff = Integer.MAX_VALUE;
            for (int i = 0; i < arr.size()-1; i++) {
                int i1 =  arr.get(i);
                int i2 =  arr.get(i+1);
                if (i2 - i1 < mindiff) mindiff = i2-i1;
            }
            fout.println(mindiff);
        }
    }
}
