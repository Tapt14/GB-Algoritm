package Lesson7;

import java.util.LinkedList;

public abstract class Path {

    private final boolean[] marked;
    private final int[] edgeTo;
    private final int source;

    public Path(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
    }

    public boolean[] getMarked() {
        return marked;
    }


    public int[] getEdgeTo() {
        return edgeTo;
    }

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
