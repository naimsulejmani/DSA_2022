package cacttus.education.graphs.implementation;

import cacttus.education.graphs.interfaces.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrixGraph implements Graph {
    int[][] adjacentMatrix; //kena me i ruajt lidhjet, deget kush me kend eshte i lidhur
    int numVertexes;// numrin e vertex apo nyjeve

    GraphType graphType = GraphType.UNDIRECTED;

    public AdjacentMatrixGraph(int numVertexes) {
        this.numVertexes = numVertexes;
        adjacentMatrix = new int[numVertexes][numVertexes];
    }

    public AdjacentMatrixGraph(int numVertexes, GraphType graphType) {
        this(numVertexes);
        this.graphType = graphType;
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 >= numVertexes || vertex2 >= numVertexes || vertex1 < 0 || vertex2 < 0) {
            throw new IllegalArgumentException("Vertex numbers not valid!");
        }
        adjacentMatrix[vertex1][vertex2] = 1;
        if (graphType == GraphType.UNDIRECTED) {
            adjacentMatrix[vertex2][vertex1] = 1;
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex >= numVertexes || numVertexes < 0) {
            throw new IllegalArgumentException("Vertex number invalid!");
        }

        List<Integer> adjacentVertexes = new ArrayList<>();
        for (int col = 0; col < this.adjacentMatrix[vertex].length; col++) {
            if (adjacentMatrix[vertex][col] == 1) {
                adjacentVertexes.add(col);
            }
        }
        Collections.sort(adjacentVertexes);
        return adjacentVertexes;
    }

    @Override
    public void removeEdge(int vertex1, int vertex2) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 >= numVertexes || vertex2 >= numVertexes) {
            throw new IllegalArgumentException("Invalid vertex!");
        }

        adjacentMatrix[vertex1][vertex2] = 0;
        if (graphType == GraphType.UNDIRECTED) {
            adjacentMatrix[vertex2][vertex1] = 0;
        }
    }
}







