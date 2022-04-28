package cacttus.education.hashing;

public class HashTable {
    private String[] array;

    public HashTable(int length) {
        this.array = new String[length];
    }

    public int hash(String key) {
        System.out.println(key.hashCode());
        return (key.hashCode() & 0x7FFFFFFF) % array.length;
    }

    @Override
    public int hashCode() {
        Double numri;
        return 17;
    }
}
