package cacttus.education.graphs.interfaces;

import java.util.List;

public interface Graph {
    enum GraphType {
        DIRECTED,
        UNDIRECTED
    }



    void addEdge(int vertex1, int vertex2);

    List<Integer> getAdjacentVertices(int vertex);

    void removeEdge(int vertex1, int vertex2);
}
