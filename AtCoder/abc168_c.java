package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc168_c {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        double a = fin.nextInt();  // hr len
        double b = fin.nextInt();  // min len
        double h = fin.nextInt();
        double m = fin.nextInt();

        double minAng = (m*6.0);
        double hrAng = (h*30.0 + minAng/12.0);
        double diffAngl = Math.abs(hrAng-minAng);

//        System.out.println(diffAngl);

        fout.println(Math.sqrt((a*a + b*b - 2*a*b*Math.cos((Math.toRadians(diffAngl))))));

    }
}
