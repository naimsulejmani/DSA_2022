package cacttus.education.linked_lists;

public class NodeTest {
    public static void main(String[] args) {
        Node nyja1 = new Node(10);

        Node nyja2 = new Node(20, nyja1);

        Node nyja3 = new Node(30);

        nyja3.setNext(nyja2);

        System.out.println(nyja3.getNext().getNext());


        System.out.println("------------------------------");
        while (nyja3 != null) {
            System.out.println(nyja3);
            nyja3 = nyja3.getNext();
        }
    }
}









