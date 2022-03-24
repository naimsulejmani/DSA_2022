package cacttus.education.adt;

import java.util.Scanner;

public class ProceduralAbstraction {


    public static void main(String[] args) {

        String name = readName(); //po abstrahoj se eshte nje metode
        //qe e kthen emrin
        printName(name); //supozoje qe e shtyp nje emer
    }

    private static String readName() {
        //duhet te implementohet
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje emer: ");
        String emri = reader.nextLine();
        reader.close();
        return emri;
    }

    private static void printName(String name) {
        //duhet te implementohet
        System.out.println(name);
    }


}
