package cacttus.education.graphs.set_implementation;

import cacttus.education.graphs.interfaces.Graph;

public class TestAdjacencySetGraph {
    public static void main(String[] args) {
        AdjacencySetGraph graph =
                new AdjacencySetGraph(Graph.GraphType.UNDIRECTED, 5);
        graph.addEdge(0, 4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 2);

        System.out.println(graph.getAdjacentVertices(2));
    }
}
