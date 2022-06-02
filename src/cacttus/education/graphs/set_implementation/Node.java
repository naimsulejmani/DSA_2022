package cacttus.education.graphs.set_implementation;

import java.util.*;

public class Node {
    private int vertexNumber;
    private Set<Integer> adjacencySet = new HashSet<>();

    public Node(int vertexNumber) {
        this.vertexNumber = vertexNumber;
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public void addEdge(int vertexNumber) {
        adjacencySet.add(vertexNumber);
    }

    public List<Integer> getAdjacencyList() {
        List<Integer> list = new ArrayList<>(adjacencySet);
        Collections.sort(list);
        return list;
    }
}







