package codeforces;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Gym118B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int n = fin.nextInt();
        int lineSize = (n * 2 + 1);
        ArrayList<String> storedLines = new ArrayList<>();

        int i = 0;
        for (int lineChars = 1; lineChars < lineSize + 1; lineChars += 2) {
//            System.out.println(lineChars);
            StringBuilder line = new StringBuilder();

            line.append("  ".repeat(Math.max(0, ((lineSize - lineChars) / 2))));

            for (int j = 0; j < i + 1; j++) {
                line.append(j).append(" ");
            }
            for (int j = i - 1; j > -1; j--) {
                line.append(j).append(" ");
            }

            line.deleteCharAt(line.length() - 1);
            storedLines.add(0, line.toString());
            fout.println(line);
            i ++;
        }
        storedLines.remove(0);  // removes middle
        for (String storedLine : storedLines) {
            fout.println(storedLine);
        }
    }
}
