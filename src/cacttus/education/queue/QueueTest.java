package cacttus.education.queue;

public class QueueTest {
    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        Queue<String> rendiNeKomune = new Queue<>(String.class);
        rendiNeKomune.enqueue("Dorant");
        rendiNeKomune.enqueue("Gresa");

        System.out.println(rendiNeKomune.dequeue());


    }
}
