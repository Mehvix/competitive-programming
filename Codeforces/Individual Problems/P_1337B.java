import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class P_1337B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();

        while (t > 0){
            t --;
            int x = fin.nextInt();
            int n = fin.nextInt();
            int m = fin.nextInt();

            for (int i = 0; i < n; i++) {
                if (x <= 20){  // 20 is the lowest possible
                    break;
                }
                x = (x/2)+10;
            }

            if (x<=m*10){
                fout.println("YES");
            } else {
                fout.println("NO");
            }
        }
    }
}
