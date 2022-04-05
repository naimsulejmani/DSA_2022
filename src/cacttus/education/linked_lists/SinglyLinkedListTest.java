package cacttus.education.linked_lists;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList lista = new SinglyLinkedList();
        lista.addFirst(100);
        lista.addFirst(50);
        lista.addFirst(200);
        lista.addLast(999);

        lista.print();
        System.out.println("----------------------");
        lista.removeFirst();
        lista.removeLast();
        lista.print();
    }
}




