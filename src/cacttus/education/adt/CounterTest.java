package cacttus.education.adt;

public class CounterTest {

    public static void main(String[] args) {
        Counter realMadridGoals = new Counter("Real Madrid");
        Counter barcelonaGoals = new Counter("Barcelona");
        barcelonaGoals.increment();
        barcelonaGoals.increment();
        barcelonaGoals.increment();
        barcelonaGoals.increment();
        System.out.println(realMadridGoals);
        System.out.println(barcelonaGoals);
    }
}
