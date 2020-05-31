package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1358B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while(t-->0){
            int n = fin.nextInt();
//            ArrayList<Integer> arr = new ArrayList<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i ++){
                arr[i] = fin.nextInt();
//                arr.add(fin.nextInt());
            }
//            Collections.sort(arr);
            Arrays.sort(arr);
//            System.out.println(arr.toString());

            int max = 0;
//            for (int i = 0; i < arr.size(); i++) {
            for (int i = 0; i < arr.length; i++) {
                int val = arr[i];
//                int val = arr.get(i);
                if (val <= i+1){
                    max = i+1;
                }
            }
            fout.println(max+1);
        }
    }
}
