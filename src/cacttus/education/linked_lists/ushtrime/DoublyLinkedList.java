package cacttus.education.linked_lists.ushtrime;

public class DoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int counter;

    public boolean isEmpty() {
        return head == null;
    }

    private void increment() {
        counter++;
    }

    private void decrement() {
        counter--;
    }

    public void addFirst(int data) {
        DNode newNode = new DNode(data);

        if (isEmpty()) {
            head = tail = newNode;
//            tail = newNode;
//            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        increment();
    }

    public void addLast(int data) {
        DNode newNode = new DNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        increment();
    }

    public void print() {
        DNode temp = head; //head...tail
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public void printReverse() {
        DNode temp = tail;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getPrev();
        }
    }

    //public DNode findByIndex(int index)
    //public void removeFirst()
    //public void removeLast()
    //public void addAfterIndex(int data, int index)
    //public void removeByIndex(int index)
}












