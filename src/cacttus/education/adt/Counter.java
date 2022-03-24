package cacttus.education.adt;

public class Counter {


    private int count = 0;
    private String id;

    public Counter(String id) {
        this.id = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                ", id='" + id + '\'' +
                '}';
    }
}






