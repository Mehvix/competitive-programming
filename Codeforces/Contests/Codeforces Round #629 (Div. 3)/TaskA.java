package codes;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a % b;
            if (c != 0){
                out.println(b-c);
            } else {
                out.println(0);
            }
        }
    }
}
