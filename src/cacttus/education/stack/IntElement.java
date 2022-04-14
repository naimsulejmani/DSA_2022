package cacttus.education.stack;

public class IntElement {
    private int data;
    private IntElement next;

    public IntElement(int data, IntElement next) {
        this.data = data;
        this.next = next;
    }

    public IntElement(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public IntElement getNext() {
        return next;
    }

    public void setNext(IntElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "IntElement{" +
                "data=" + data +
                '}';
    }
}
