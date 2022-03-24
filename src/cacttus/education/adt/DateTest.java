package cacttus.education.adt;

public class DateTest {
    public static void main(String[] args) {

        Date ditelindjaIme = new Date(10, 10, 2010);
        System.out.println(ditelindjaIme);

        Date ditelindjaYte = new Date("5.5.2005");
        System.out.println(ditelindjaYte);

        Date ditelindjaJote = new Date("5.5.2003.2");
        System.out.println(ditelindjaJote);
    }
}