package cacttus.education.graphs.implementation;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private T data;
    private List<Node> next;

    public Node(T data) {
        this.data = data;
        next = new ArrayList<>();
    }

    public Node(T data, List<Node> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Node> getNext() {
        return next;
    }

    public void setNext(List<Node> next) {
        this.next = next;
    }
}
