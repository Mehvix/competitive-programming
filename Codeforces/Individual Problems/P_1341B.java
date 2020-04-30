package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1341B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        /* Outline:
         * Parse
         * Make binary list of peeks
         * Iterate and find peeks within k-2 (?) of one another
         * Find max
         * Find leftmost
         * */

        int t = fin.nextInt();

        while (t > 0){
            t --;
            int n = fin.nextInt();
            int k = fin.nextInt();

            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = fin.nextInt();
            }

            int[] peaks = new int[n];
            for (int i = 1; i < n - 1; i++) {
                int peakCurrent = heights[i];
                int peakLast = heights[i - 1];
                int peakNext = heights[i + 1];

                if (peakCurrent > peakLast && peakCurrent > peakNext){
                    peaks[i] = 1;
                }
            }
//            System.out.println(Arrays.toString(peaks));
            int sum = 0;
            int[] prefixSum = new int[n];
            for (int i = 0; i < n; i++) {
                sum += peaks[i];
                prefixSum[i] = sum;
            }
//            System.out.println(Arrays.toString(prefixSum));

            int range = k - 2;
            int max = 0;
            int leftmost = 0;
            for (int i = 0; i < n - k + 1; i++) {
                int currentPeaks = prefixSum[i + range] - prefixSum[i];  // we use this so we don't have to find keep finding the sum of peaks which is ~o(k*n)
                if (currentPeaks > max) {
                    max = currentPeaks;
                    leftmost = i;
                }
            }
            fout.println((max + 1) + " " + (leftmost + 1));
//            System.out.println("---");
        }

    }
}
