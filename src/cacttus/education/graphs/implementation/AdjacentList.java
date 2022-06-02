package cacttus.education.graphs.implementation;

import cacttus.education.graphs.interfaces.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacentList implements Graph {

    List<Node<Integer>> nodes = new ArrayList<>();
    private int numVertexes;

    public AdjacentList(int numVertexes) {
        this.numVertexes = numVertexes;
        for (int i = 0; i < numVertexes; i++) {
            nodes.add(new Node<>(i));
        }
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 >= numVertexes || vertex2 >= numVertexes) {
            throw new IllegalArgumentException("Vertex not in range!");
        }
        nodes.get(vertex1).getNext().add(new Node<>(vertex2));
    }

    @Override
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex < 0 || vertex >= numVertexes)
            throw new IllegalArgumentException("Vertex not in range!");
        List<Integer> returnList = new ArrayList<>();
        for (Node<Integer> node : nodes.get(vertex).getNext()) {
            returnList.add(node.getData());
        }
        return returnList;

    }

    @Override
    public void removeEdge(int vertex1, int vertex2) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 >= numVertexes || vertex2 >= numVertexes) {
            throw new IllegalArgumentException("Vertex not in range!");
        }
        //peraferisht i njejte
        for (Node<Integer> node : nodes.get(vertex1).getNext()) {
            if (node.getData() == vertex2) {
                nodes.get(vertex1).getNext().remove(node);
            }
        }

    }
}
