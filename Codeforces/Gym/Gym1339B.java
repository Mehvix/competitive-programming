package codeforces;


import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class Gym1339B {
    public static void main (String[] args) {
        Scanner fin = new Scanner(System.in);
        int t = fin.nextInt();
        while (t > 0){
            t --;
            int n = fin.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(fin.nextLong());
            }

            Collections.sort(arr);
            int middle=arr.size()/2;
            System.out.print(arr.get(middle)+" ");
            int back = middle - 1;
            int forward = middle + 1;
            boolean flag = false;
            while(((!flag) && (back >= 0)) || ((flag) && (forward < n)))
            {
                if(!flag){
                    System.out.print(arr.get(back) + " ");
                    back --;
                    flag = true;
                }
                else{
                    System.out.print(arr.get(forward) + " ");
                    forward ++;
                    flag = false;
                }
            }
            System.out.print("\n");
        }
    }
}
