package cacttus.education.linked_lists.ushtrime;

public class NodeExam {
    private int data;
    private NodeExam left;
    private NodeExam right;
    private NodeExam up;

    public NodeExam(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeExam getLeft() {
        return left;
    }

    public void setLeft(NodeExam left) {
        this.left = left;
    }

    public NodeExam getRight() {
        return right;
    }

    public void setRight(NodeExam right) {
        this.right = right;
    }

    public NodeExam getUp() {
        return up;
    }

    public void setUp(NodeExam up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return "NodeExam{" +
                "data=" + data +
                '}';
    }
}
