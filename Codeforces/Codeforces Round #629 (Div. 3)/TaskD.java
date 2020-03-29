package codes;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        // todo this doesn't pass test case #2
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] paint = new int[n];
            int types = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                paint[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    paint[i] = 1;
                } else {
                    int last_paint = paint[i - 1];
                    int cur_paint = paint[i];
                    int last_type = arr[i - 1];
                    int cur_type = arr[i];

                    if (i == n - 1) {
                        if (cur_type != last_type && cur_type != arr[0]) {
                            if (last_paint == 1) {
                                paint[i] = 2;
                            } else if (last_paint == 2) {
                                paint[i] = 3;
                                types = 3;
                            }
                        } else {
                            if (cur_type == arr[0]) {
                                paint[i] = 1;
                            } else {
                                paint[i] = 2;
                            }
                        }
                    } else {
                        if (last_type == cur_type) {
                            paint[i] = last_paint;
                        } else if (last_paint == 1) {
                            paint[i] = 2;
                            types = 2;
                        } else {
                            paint[i] = 1;
                        }
                    }
                }

            }
            out.println(types);
            for (int a : paint) {
                out.print(a + " ");
            }
            out.println();
            /*
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] paint = new int[n];
            ArrayList<Integer> stored = new ArrayList<>();
            int types = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                paint[i] = 0;
            }

            // paint[2] = 1;  // prevents endless loop later on
            for (int i = 0; i < n; i++) {
                int next_index;
                if (i == n - 1) {
                    next_index = 0;
                } else {
                    next_index = i + 1;
                }
                int next_paint = paint[next_index];
                int next_type = arr[0];
                int cur_paint = paint[i];
                int cur_type = arr[i];

                if (cur_type != next_type) {
                    //if (cur_paint == 0) {
                    //    paint[i] = 1;
                        // paint[next_index] = 2;
                    //} else
                    if (cur_paint == 1) {
                        paint[next_index] = 2;
                    } else {
                        paint[next_index] = 1;
                    }
                } else {
                    stored.add(i);
                }
            }

            while (stored.size() != 0) {
                int a = stored.get(0);
                int last_index, next_index;
                if (a == 0) {
                    last_index = n - 1;
                } else {
                    last_index = a - 1;
                }
                if (a == n) {
                    next_index = 0;
                } else {
                    next_index = a + 1;
                }

                int last_value = arr[last_index];
                int curr_value = arr[a];
                int next_value = arr[next_index];
                int last_paint = paint[last_index];
                int curr_paint = paint[a];
                int next_paint = paint[next_index];

                if (last_value == curr_value) {
                    if (next_value == curr_value) {
                        if (last_paint != 0) {
                            paint[a] = last_paint;
                            stored.remove(0);
                        } // else {
                          //  paint[a] = next_paint;
                        //}
                    } else {
                        paint[a] = last_paint;
                        stored.remove(0);
                    }
                } else {
                    if (next_value == curr_value) {
                        if (last_paint == 1) {
                            paint[a] = 2;
                            stored.remove(0);
                        } else if (last_paint == 2) {
                            paint[a] = 1;
                            stored.remove(0);
                        }
                    } else if (last_paint == 1 && next_paint == 1) {
                        paint[a] = 2;
                        stored.remove(0);
                    } else if (last_paint == 2 && next_paint == 2) {
                        paint[a] = 1;
                        stored.remove(0);
                    } else {
                        paint[a] = 3;
                        stored.remove(0);
                    }

                }
            }
            //out.println(types);
            for (int a : paint) {
                out.print(a + " ");
            }
            out.println();
            */
        }
    }
}
