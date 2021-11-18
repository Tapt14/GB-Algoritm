package Lesson7;

import java.util.LinkedList;

public class BreadthFirstPaths extends Path{

    public BreadthFirstPaths(Graph g, int source) {
        super(g, source);
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addFirst(source);
        getMarked()[source] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.removeLast();
            for (int w : g.getAdjList(vertex)) {
                if (!getMarked()[w]) {
                    getMarked()[w] = true;
                    getEdgeTo()[w] = vertex;
                    queue.addFirst(w);
                }
            }
        }
    }
}

