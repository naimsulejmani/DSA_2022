package cacttus.education.stack;

public class DoubleElement {
    private double data;
    private DoubleElement next;

    public DoubleElement(double data, DoubleElement next) {
        this.data = data;
        this.next = next;
    }

    public DoubleElement(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public DoubleElement getNext() {
        return next;
    }

    public void setNext(DoubleElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoubleElement{" +
                "data=" + data +
                '}';
    }
}
