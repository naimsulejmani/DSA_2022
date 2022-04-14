package cacttus.education.stack;

public class StackArrayTest {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        StackArray<String> entrances = new StackArray<>(String.class);
        entrances.push("Naim");
        entrances.push("Filan");
        entrances.push("Fistek");
        System.out.println(entrances.pop());
        System.out.println(entrances.peek());

        StackArray<Integer> numrat = new StackArray<>(Integer.class);
        numrat.push(10);
        numrat.push(20);
        System.out.println(numrat.getSize());
        System.out.println(numrat.isEmpty());
        System.out.println(numrat.isFull());
    }
}
