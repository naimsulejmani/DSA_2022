package cacttus.education.queue;

public class QueueUnderflowException extends Exception{
    public QueueUnderflowException() {
    }

    public QueueUnderflowException(String message) {
        super(message);
    }
}
