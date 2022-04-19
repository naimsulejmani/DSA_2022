package cacttus.education.queue;

import cacttus.education.shared.Helper;

import java.lang.reflect.Array;

public class Queue<T> {
    private final int SPECIAL_EMPTY_VALUE = -1;
    private final int MAX_SIZE = 100;
    private T[] elements;

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> clazz) {
        //gjenerimi i vargut gjenerik ->
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull() {
        int newIndex = (tailIndex + 1) % elements.length;
        return headIndex == newIndex;
    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) throw new QueueOverflowException("Queue is full!");
        tailIndex = (tailIndex + 1) % elements.length;//gjenero indeksin e ri
        elements[tailIndex] = data; //vendose elementin ne indeksin e gjeneruar

        //nese lista eshte e zbrazur (empty) atehere head eshte tail
        if (isEmpty()) headIndex = tailIndex;
    }

    public T dequeue() throws QueueUnderflowException {
//        if (isEmpty()) throw new QueueUnderflowException("Queue is empty!");
//        T data = elements[headIndex];
        T data = peek();

        if (headIndex == tailIndex)
            headIndex = SPECIAL_EMPTY_VALUE;
        else
            headIndex = (headIndex + 1) % elements.length;
        return data;
    }

    public T peek() throws QueueUnderflowException {
        if (isEmpty()) throw new QueueUnderflowException("Queue is empty!");
        return elements[headIndex];
    }

    public boolean offer(T data) throws QueueOverflowException {
        if (isFull()) return false;
        enqueue(data);
        return true;
    }

    public int getSize() {
        if (headIndex == SPECIAL_EMPTY_VALUE) return 0;
        if (headIndex <= tailIndex) return tailIndex - headIndex + 1;
        else
            return MAX_SIZE + tailIndex + 1 - headIndex;
    }

}








