package codeforces;

import java.util.*;
import java.util.Scanner;
import java.io.PrintWriter;

class Graph {
    int vertex;
    LinkedList<Integer>[] list;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        //add back edge ((for undirected)
        list[destination].addFirst(source);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}


public class abc168_d {
    public void solve(int testNumber, Scanner fin, PrintWriter fout) {
        int n = fin.nextInt();  // rooms
        int m = fin.nextInt();  // passages
        Graph graph = new Graph(n+1);
        int[] direction = new int[n+1];
        Arrays.fill(direction, -1);

        for (int i = 0; i < m; i++) {
            int a = fin.nextInt();
            int b = fin.nextInt();
            graph.addEdge(a, b);
        }

//        graph.printGraph();

        // bfs
        LinkedList<Integer> quePrev = new LinkedList<>();
        LinkedList<Integer> queNodes = new LinkedList<>();

        for (int i : graph.list[1]) {
            queNodes.add(i);
            quePrev.add(1);
        }


        while(!queNodes.isEmpty()) {
            int root = queNodes.pop();
            int prev = quePrev.pop();
//            System.out.println("On " + root);
            if (direction[root] != -1) continue;
            direction[root] = prev;
//            System.out.println("Pointing to " + prev);
//            System.out.println("Adding " + graph.list[root].toString());
            for (int i : graph.list[root]) {
                if (i == 1) continue;
                queNodes.add(i);
                quePrev.add(root);
            }
//            System.out.println(queNodes.toString());
//            System.out.println(Arrays.toString(direction));
        }

        boolean visitedAll = true;
        for (int i = 2; i < direction.length; i++) {
            if (direction[i] == -1) {
                fout.println("No");
                visitedAll = false;
                break;
            }
        }

        if (visitedAll) {
            fout.println("Yes");
            for (int i = 2; i < direction.length; i++) {
                fout.println(direction[i]);
            }
        }

    }


}
