package cacttus.education.stack;

import java.lang.reflect.Array;

public class StackArray<T> {
    private final int MAX_SIZE = 100;
    private T[] elements;
    private int size;

    public StackArray(Class<T> clazz) {

        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public void push(T data) throws StackOverflowException {
        if (isFull())
            throw new StackOverflowException("Stack is full!");
        elements[size++] = data;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty())
            throw new StackUnderflowException("Stack is empty!");
        return elements[size - 1];
    }

    public T pop() throws StackUnderflowException {
        T data = peek();
        elements[--size] = null;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int getSize() {
        return size;
    }


}




