package cacttus.education.linked_lists.ushtrime;

public class DNode {
    private int data;
    private DNode prev;
    private DNode next;

    public DNode(int data) {
        this.data = data;
    }

    public DNode(int data, DNode prev, DNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DNode{" +
                "data=" + data +
                '}';
    }
}
