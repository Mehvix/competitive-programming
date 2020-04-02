import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int x = fin.nextInt();
        int sum = 0;

        for (char i : Integer.toBinaryString(x).toCharArray()){
            sum += Character.getNumericValue(i);
        }

        fout.println(sum);
    }
}
