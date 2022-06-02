package cacttus.education.graphs.set_implementation;

import cacttus.education.graphs.interfaces.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencySetGraph implements Graph {
    private List<Node> vertexList = new ArrayList<>();
    private GraphType graphType = GraphType.UNDIRECTED;
    private int numVertexes = 0;

    public AdjacencySetGraph(GraphType graphType, int numVertexes) {
        this.graphType = graphType;
        this.numVertexes = numVertexes;
        for (int i = 0; i < numVertexes; i++) {
            vertexList.add(new Node(i));
        }
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 >= numVertexes || vertex2 >= numVertexes || vertex1 < 0
                || vertex2 < 0) {
            throw new IllegalArgumentException("Vertex numbers not valid!");
        }
        vertexList.get(vertex1).addEdge(vertex2);
        if (graphType == GraphType.UNDIRECTED) {
            vertexList.get(vertex2).addEdge(vertex1);
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex < 0 || vertex >= numVertexes)
            throw new IllegalArgumentException("Vertex not in range!");
        return vertexList.get(vertex).getAdjacencyList();
    }

    @Override
    public void removeEdge(int vertex1, int vertex2) {

    }
}
