import java.util.*;

public class Graph{
    private Map<Integer, List<Integer>> adj;
    Graph(){
        adj = new HashMap<>();
    }

    public void insertEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(u).add(v);
        adj.get(v).add(u); 
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    public void dfsHelper(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (int neighbor : adj.getOrDefault(vertex, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbor : adj.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    } 
    public static void main(String[] args) {
        Graph g = new Graph();
        g.insertEdge(1, 2);
        g.insertEdge(1, 3);
        g.insertEdge(1, 4);
        g.insertEdge(2, 5);
        g.insertEdge(2, 6);
        g.insertEdge(3, 7);
        g.insertEdge(3, 8);

        System.out.println("DFS: ");
        g.dfs(1);

        System.out.println("\nBFS: ");
        g.bfs(1);
    }  
}