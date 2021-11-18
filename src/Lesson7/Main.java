package Lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,4);
        graph.addEdge(1,3);
        graph.addEdge(1,6);
        graph.addEdge(2,3);
        graph.addEdge(2,8);
        graph.addEdge(4,5);
        graph.addEdge(5,8);
        graph.addEdge(6,7);
        graph.addEdge(7,9);
        graph.addEdge(8,9);

        /*System.out.println(graph.getEdgeCount());
        System.out.println(graph.getAdjList(2));

        DepthFirstPaths dfp = new DepthFirstPaths(graph, 1);
        System.out.println(dfp.hasPathTo(0));
        System.out.println(dfp.pathTo(0));*/

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 0);
        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(9));

    }
}
