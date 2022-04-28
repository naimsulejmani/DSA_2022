package cacttus.education.hashing;

import java.time.LocalDate;

public class TransactionTestHash {
    public static void main(String[] args) {
        Transaction t1 =
                new Transaction("Naim Sulejmani", LocalDate.now(), 100);
        Transaction t2 =
                new Transaction("Filani", LocalDate.of(2000, 1, 1),
                        300);
        Transaction t3 =
                new Transaction("Naim Sulejmani", LocalDate.now(), 100);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t2));
    }
}






