package cacttus.education.stack;

public class Stack<T> {
    private final int MAX_SIZE = 100;
    private Element<T> top; //referenca TOP e stack
    private int size;

    public void push(T data) throws StackOverflowException {
        if (isFull())
            throw new StackOverflowException("Stack is full!");
        //Elementi i ri qe krijohet e merr si reference per next top(te tanishem)
        Element<T> newElement = new Element<>(data, top);
        //ndro referencen e top-it me elementin e ri per shkak te stack
        top = newElement;
        size++;//rrite per njo numrin e elementeve
    }

    public T pop() throws StackUnderflowException {
//        if (size == 0)
//            throw new StackUnderflowException("Stack is empty!");
//        T data = top.getData(); //njxerre te dhene nga stack - top
        T data = peek();

        top = top.getNext(); // ndro referencen e top pershkak te fshirjes
        size--; //zbrite numrin e elementeve
        return data; //kthe te dhenen shfrytezuesit
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty())
            throw new StackUnderflowException("Stack is empty!");
        return top.getData();
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




