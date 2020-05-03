import java.util.*;
import java.io.PrintWriter;

public class P_1348B {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int t = fin.nextInt();
        while (t -- > 0){
            int n = fin.nextInt();
            int k = fin.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(fin.nextInt());
            }

            if (set.size() > k){  // if we have more than k unique chars
                fout.println("-1");
            } else {
                fout.println(k * n);

                StringBuilder reqStrBldr = new StringBuilder();
                for (Integer i : set) {
                    reqStrBldr.append(i).append(" ");
                }

                int value = (int) set.toArray()[0];
                for (int i = set.size(); i < k; i ++){
                    reqStrBldr.append(value).append(" ");
                }

                String reqStr = reqStrBldr.toString();
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    result.append(reqStr);
                }
                fout.println(result);
            }
        }
    }

    private boolean notNew(int value, Set<Integer> req) {
        for(int i: req){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}
