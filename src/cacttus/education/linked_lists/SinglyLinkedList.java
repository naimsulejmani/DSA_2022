package cacttus.education.linked_lists;

public class SinglyLinkedList {
    //duhet me permbajt nyjen fillestare apo nyjen koke
    private Node head;
    private int counter = 0;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(Node head) {
        this.head = head;
        counter++;
    }

    //lista eshte e zbrazur kur kemi head ==null
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
        Node newNode = new Node(data); //krijo nyjen e re
        newNode.setNext(head); //nyja e re dergon tek head kush ka qene koka e listes se nderlidhur
        head = newNode;//ndro head te listes se nderlidhur me fillu nga nyja e re
        increment();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (isEmpty()) {
            addFirst(data);
            return;
        }

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        increment();
    }

    public int size() {
        return counter;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Lista eshte e zbrazur");
            return;
        }
        head = head.getNext();
        decrement();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Lista eshte e empty!");
            return;
        }
        //nese lista e ka vetem nje element
        //atehere head = null fshije edhe ate element
        if (head.getNext() == null) {
            head = null;
            decrement();
            return;
        }

        Node temp = head;
        //perderisa next i nextit eshte i ndryshum prje null atehere
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        decrement();
    }

    //metoda e cila kthen nyjen sipas indeksit te zgjedhur
    public Node findByIndex(int index) {
        if (index < 0) {
            System.out.println("Nuk lejohen indeksi negative!");
        } else if (index >= counter) {
            System.out.println("Nuk ka aq elemente ne liste!");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp; //kthe nyjen e gjetur ne ate pozite
        }
        return null; //kthe null nese nuk eshte gjetur
    }

    public void addAfterIndex(int data, int index) {
        Node node = findByIndex(index); //gjej nyjen sipas indeksit

        if (node == null) {
            System.out.println("Nyja nuk eshte gjetur!");
            return;
        }
        //u krijua nyja e re me vleren e dhene pra (katrori me vlere)
        Node newNode = new Node(data);
        newNode.setNext(node.getNext());//nyja e re dergon ku ka derguar nyja paraprake
        node.setNext(newNode); //nyja e vjeter dergon tek nyja e re tashme
        increment();
    }


    public void print() {
        //kjo gabim per shkak se jemi duke perdore referencen e head
        //dhe pasi te nderrojme hupim elementet ne varg
        //head normalisht nuk guxon te ndrohet gjate leximit
//        while (head != null) {
//            System.out.println(head);
//            head = head.getNext();
//        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

}







