package cacttus.education.linked_lists.ushtrime;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList lists = new DoublyLinkedList();
        lists.addFirst(10);
        lists.addFirst(20);
        lists.addFirst(30);
        lists.addLast(100);
        lists.addLast(200);

        System.out.println("PRINT NORMAL (HEAD TO TAIL)");
        System.out.println("---------------");
        lists.print();
        System.out.println("---------------");
        System.out.println("PRINT REVERSE (TAIL TO HEAD)");
        System.out.println("---------------");
        lists.printReverse();
        System.out.println("---------------");


    }
}
