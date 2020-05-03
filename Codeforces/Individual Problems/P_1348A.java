import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1348A {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0){
            int n = fin.nextInt();
            ArrayList<Integer> nums = new ArrayList<Integer>();

            int stack1 = (int)Math.pow(2,n);
            int stack2 = (int)Math.pow(2,n/2);

            for (int i = 1; i < n / 2; i++) {
                stack1 += (int)Math.pow(2,i);
                stack2 += (int)Math.pow(2,i + n/2);
            }

            fout.println(Math.abs(stack1 - stack2));
        }

    }
}
