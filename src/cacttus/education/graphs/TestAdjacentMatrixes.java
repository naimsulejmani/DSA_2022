package cacttus.education.graphs;

import cacttus.education.graphs.implementation.AdjacentMatrixGraph;

public class TestAdjacentMatrixes {
    public static void main(String[] args) {
        AdjacentMatrixGraph graph = new AdjacentMatrixGraph(5);
        graph.addEdge(4, 4);
        graph.addEdge(4, 3);
        graph.addEdge(4, 1);
        graph.addEdge(4, 0);

        System.out.println(graph.getAdjacentVertices(0));
        System.out.println(graph.getAdjacentVertices(4));
    }
}
