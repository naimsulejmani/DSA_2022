package cacttus.education.hashing;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable ht = new HashTable(20);
        System.out.println(ht.toString());
        System.out.println(ht.hashCode());
        System.out.println(ht);

        System.out.println("TEST HASH FUNCTION");
        System.out.println(ht.hash("emri"));
        System.out.println(ht.hash("RealMadrid"));
        System.out.println(ht.hash("ManchesterCity"));
        System.out.println(ht.hash("Barcelona"));
        System.out.println(ht.hash("Liverpool"));
        System.out.println(ht.hash("liverpool"));
    }
}

