package codes;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int T = in.nextInt();
        while (T-- > 0){
            int n = in.nextInt(), k = in.nextInt(), left = n - 2, right = n - 1;

            for (int i = n - 2; i >= 0; i--){
                if (k <= n - i -1){
                    left = i;
                    right = n - k;
                    break;
                }
                k -= n - i - 1;
            }

            char[] arr = new char[n];
            Arrays.fill(arr, 'a');
            arr[left] = 'b';
            arr[right] = 'b';
            out.println(arr);
        }
    }
}
