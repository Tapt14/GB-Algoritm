package Lesson7;

public class DepthFirstPaths extends Path {


    public DepthFirstPaths(Graph g, int source) {
        super(g, source);
        dfs(g, source);
    }

    private void dfs(Graph g, int v) {
        getMarked()[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!getMarked()[w]) {
                getEdgeTo()[w] = v;
                dfs(g, w);
            }
        }
    }
}
