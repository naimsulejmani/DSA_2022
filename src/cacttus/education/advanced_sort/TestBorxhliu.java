package cacttus.education.advanced_sort;

public class TestBorxhliu {
    public static void main(String[] args) {
        Borxhliu borxhliu1 = new Borxhliu("Endrit Ceku", 500);
        Borxhliu borxhliu2 = new Borxhliu("Erion Ferizi", 777);
        Borxhliu borxhliu3 = new Borxhliu("Liona Kalludra", 400);


        System.out.println(borxhliu1.compareTo(borxhliu2));
        System.out.println(borxhliu2.compareTo(borxhliu1));

        Borxhliu[] borxhlius = {borxhliu1, borxhliu2, borxhliu3};

        //compare to nese kthen -1 objekti eshte me i vogel se elementi me te cilin krahasohet
        //compare to nese kthen 1 objekti eshte me i madh se elemteni me te cilin krahasohet
        //perndryshe jane te barabarte
    }
}
