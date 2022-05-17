package cacttus.education.hashing.collisions;

import java.util.LinkedList;

public class HashTable {
    private LinkedList<String>[] hashTable;
    private String[] table;

    private HashTable(int N) {
        hashTable = new LinkedList[N];
        table = new String[N];
    }

    public void put(String value) {
        int hashIndex = hashCode(value); //gjej hash per vleren
        while (table[hashIndex] != null) {
            //perderisa pozita ku deshirojme me vendose nuk eshte  lire
            //shko tek elementi vijues ne hashtabel
            hashIndex = (hashIndex + 1) % table.length;
        }
        table[hashIndex] = value;
    }

    //vendosja e elementit ne hashTabel
    public void put(String key, String value) {
        //gjej poziten se ku do te vendoset elementi ne hashtabel
        int hashIndex = hashCode(key);

        //nese tabela eshte ne ate index eshte e painicializuar
        if (hashTable[hashIndex] == null) {
            hashTable[hashIndex] = new LinkedList<>();
        }
        //inserto vleren ne liste te nderlidhur
        hashTable[hashIndex].add(value);
    }

    public int hashCode(String key) {
        return (key.hashCode() & 0x7fffffff) % hashTable.length;
    }


}









