package cacttus.education.stack;

public class StackTest {
    public static void main(String[] args)
            throws StackOverflowException, StackUnderflowException {
        Stack<String> entrance = new Stack<>();
        entrance.push("Naim");
        entrance.push("Filan");
        entrance.push("Fistek");
        entrance.pop();
        System.out.println(entrance.peek());
        System.out.println(entrance.getSize());
    }
}
