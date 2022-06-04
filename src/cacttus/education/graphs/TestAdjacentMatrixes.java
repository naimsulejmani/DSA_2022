package cacttus.education.graphs;

import cacttus.education.graphs.implementation.AdjacentMatrixGraph;
import cacttus.education.graphs.interfaces.Graph;
import cacttus.education.queue.QueueOverflowException;
import cacttus.education.queue.QueueUnderflowException;

public class TestAdjacentMatrixes {
    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException {
        AdjacentMatrixGraph graph = new AdjacentMatrixGraph(5);
        graph.addEdge(4, 4);
        graph.addEdge(4, 3);
        graph.addEdge(4, 1);
        graph.addEdge(4, 0);

        System.out.println(graph.getAdjacentVertices(0));
        System.out.println(graph.getAdjacentVertices(4));

        Graph.dfs(graph,5);
        System.out.println("-------------------------------------");
        Graph.bfs(graph,5);
    }
}
