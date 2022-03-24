package cacttus.education.adt;

public class TransactionTest {
    public static void main(String[] args) {
        Transaction pagesaCactus1 =
                new Transaction("Omer Shaqiri", new Date("23.03.2022"), 200.50);

        Transaction blerjaLaptop =
                new Transaction("Muala Kabashi,22.02.2021,1999.99");

        System.out.println(pagesaCactus1);
        System.out.println(blerjaLaptop);
    }
}
