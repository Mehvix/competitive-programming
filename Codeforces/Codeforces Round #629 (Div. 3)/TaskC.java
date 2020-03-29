package codes;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int T = in.nextInt();
        while (T-- > 0){
            int n = in.nextInt();

            // For some reason I can't understand, reading x as an int doesn't work?
            // https://codeforces.com/contest/1328/submission/74690659
            /*
            long x = in.nextInt();
             */

            String x = in.next();
            int[] arrX = new int[x.length()];
            for(int j=0;j<n;j++){
                String a=x.substring(j,j+1);
                int b = Integer.parseInt(a);
                arrX[j]=b;
            }

            int[] arrHigh = new int[n];
            int[] arrLow = new int[n];
            boolean equal = true;

            for (int i = 0; i < n; i++){
                if (i == 0){
                    arrHigh[i] = 1;
                    arrLow[i] = 1;
                } else {
                    /*
                    int value = Character.getNumericValue(String.valueOf(x).charAt(i));
                     */
                    int value = arrX[i];
                    if (value == 0) {
                        arrHigh[i] = 0;
                        arrLow[i] = 0;
                    } else if (value == 1) {
                        if (equal) {
                            arrHigh[i] = 1;
                            arrLow[i] = 0;
                            equal = false;
                        } else {
                            arrLow[i] = 1;
                            arrHigh[i] = 0;
                        }
                    } else if (value == 2) {
                        if (equal) {
                            arrHigh[i] = 1;
                            arrLow[i] = 1;
                        } else {
                            arrLow[i] = 2;
                            arrHigh[i] = 0;
                        }
                    }
                }
            }
            for (int a : arrHigh) {
                out.print(a);
            }
            out.print('\n');
            for (int a : arrLow) {
                out.print(a);
            }
            out.print('\n');

        }
    }
}
