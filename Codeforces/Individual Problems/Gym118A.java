package codeforces;

import java.util.Scanner;
import java.io.PrintWriter;

public class Gym118A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String wordIn = in.next().toLowerCase();
        StringBuilder wordOut = new StringBuilder();

        for (int i = 0; i < wordIn.length(); i++) {
             char letter = wordIn.charAt(i);

             if (
                letter != 'a' &&
                letter != 'e' &&
                letter != 'i' &&
                letter != 'o' &&
                letter != 'y' &&
                letter != 'u'){
                 wordOut.append(".").append(letter);
             }
        }

        out.println(wordOut);

    }
}
