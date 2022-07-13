package Tree;

import java.util.ArrayList;
import java.util.Stack;

class Pair {
    private int v;
    private int weight;

    Pair(int _v, int _w) {
        v = _v;
        weight = _w;
    }

    int getV() {
        return v;
    }

    int getWeight() {
        return weight;
    }
}

class short_path_wei {

    static void topologicalsort(int node, boolean visited[], Stack<Integer> stack, ArrayList<ArrayList<Pair>> adj) {
        visited[node] = true;
        for (Pair it : adj.get(node)) {
            if (visited[it.getV()] == false) {
                topologicalsort(it.getV(), visited, stack, adj);
            }
        }
        stack.push(node);
    }

    void shortestPath(int s, ArrayList<ArrayList<Pair>> adj, int N) {
        Stack<Integer> stack = new Stack<>();
        int dist[] = new int[N];

        boolean visited[] = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (visited[i] == false) {
                topologicalsort(i, visited, stack, adj);
            }
        }

        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (dist[node] != Integer.MAX_VALUE) {
                for (Pair it : adj.get(node)) {
                    if (dist[node] + it.getWeight() < dist[it.getV()]) {
                        dist[it.getV()] = dist[node] + it.getWeight();
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.print("INF");
            } else {
                System.out.print(dist[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }

        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(4, 1));
        adj.get(0).add(new Pair(2, 3));
        adj.get(0).add(new Pair(3, 6));
        adj.get(0).add(new Pair(2, 2));
        adj.get(0).add(new Pair(5, 4));
        adj.get(0).add(new Pair(3, 1));

        short_path_wei obj = new short_path_wei();
        obj.shortestPath(0, adj, n);
    }
}