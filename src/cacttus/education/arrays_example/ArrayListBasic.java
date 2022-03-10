package cacttus.education.arrays_example;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Naim");
        lista.add("Filan");
        lista.add(true);
        lista.add(100l);
        lista.add(200f);
        lista.add('k');
        lista.add(345);

        String emri = (String) lista.get(0);
        boolean isAlive = (boolean) lista.get(2);
        System.out.println(emri);
        System.out.println(isAlive);
        System.out.println(lista.get(4));

        System.out.println("----------------------");
        //bredhja neper secilin element te listes
        for (Object item : lista) {
            System.out.println(item);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
}





