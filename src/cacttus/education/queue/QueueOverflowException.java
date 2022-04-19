package cacttus.education.queue;

public class QueueOverflowException extends Exception {
    public QueueOverflowException() {
    }

    public QueueOverflowException(String message) {
        super(message);
    }
}
