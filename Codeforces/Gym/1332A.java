package codes;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        /*
        * 1. Parse stuff
        * 2. Find range of left/right/top/bottom
        * 3. If values in step 2 are less than or equal to values parsed, we good
        */

        int T = fin.nextInt();

        while (T -- > 0) {
            int reqLeft  = fin.nextInt(), reqRight = fin.nextInt(), reqDown = fin.nextInt(), reqUp = fin.nextInt();
            int startX = fin.nextInt(), startY = fin.nextInt();
            int boxX1 = fin.nextInt(), boxY1 = fin.nextInt(), boxX2 = fin.nextInt(), boxY2 = fin.nextInt();

            int rangeX = (startX - reqLeft + reqRight);
            int rangeY = (startY - reqDown + reqUp);

            if (
                    boxX1 <= rangeX && rangeX <= boxX2 && (boxX1 < boxX2 || reqLeft == 0 || reqRight == 0) &&
                    boxY1 <= rangeY && rangeY <= boxY2 && (boxY1 < boxY2 || reqDown == 0 || reqUp == 0)
            ) {
                fout.println("Yes");
            } else {
                fout.println("No");
            }
        }

    }
}
