package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc167_c {
    ArrayList<ArrayList<Integer>> combos;
    int n;

    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        n = fin.nextInt();//num books
        int m = fin.nextInt();//num algos
        int x = fin.nextInt();//algo goal

        combos = new ArrayList<>();

        int[][] books = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            books[i][0] = fin.nextInt();  // cost
            for (int j = 1; j < m+1; j++) {
                books[i][j] = fin.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(books));

        for(int i = 0; i < n; i ++){
            dfs(i, new boolean[n], new ArrayList<Integer>());  // create all combos of books
        }

        /*for (ArrayList<Integer> combo : combos) {
            System.out.println(combo.toString());
        }*/

        ArrayList<Integer> possible = new ArrayList<>();

        for (ArrayList<Integer> bookOrder : combos) {
//            System.out.println("Book Order: " + bookOrder.toString());
            int costSum = 0;
            int[] algoSum = new int[m];
            boolean algosSumLow = true;

            for (int bookNum : bookOrder) {
//                System.out.println("Adding book " + bookNum);
                costSum += books[bookNum][0];
                for (int j = 1; j < m+1; j++) {
                    algoSum[j-1] += books[bookNum][j];
                }
//                System.out.println(Arrays.toString(algoSum));

                for (int value : algoSum) {
                    if (value < x) {
                        algosSumLow = true;
                        break;
                    } else {
                        algosSumLow = false;
                    }
                }

                if (!algosSumLow) {
                    possible.add(costSum);
//                    System.out.println(Arrays.toString(algoSum));
                    break;
                }
            }
        }

//        System.out.println(possible.toString());
        int min = Integer.MAX_VALUE;
        for (int y : possible) {
            min = Math.min(min, y);
        }
        if (min == Integer.MAX_VALUE) fout.println(-1);
        else fout.println(min);
    }

    private void dfs(int bookNum, boolean[] visited, ArrayList<Integer> combo) {
        visited[bookNum] = true;
        combo.add(bookNum);
        if (combo.size() == n) combos.add(combo);
        else {
            for (int i = 0; i < n; i++) {
                if (visited[i]) continue;
//                System.out.println("Going to " + i + " " + combo.toString() + " " + Arrays.toString(visited));
                dfs(i, visited.clone(), (ArrayList<Integer>) combo.clone());
            }
        }
    }
}
