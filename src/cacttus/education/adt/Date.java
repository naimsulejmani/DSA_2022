package cacttus.education.adt;

public class Date {


    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //24.03.2022
    public Date(String date) {
        String[] splitString = date.split("\\.");//["24","03","2022"]
        //kontrollo se pas ndarjes me pike, a i kemi 3 elemente ne varg
        if (splitString.length == 3) {
            this.day = Integer.parseInt(splitString[0]);
            this.month = Integer.parseInt(splitString[1]);
            this.year = Integer.parseInt(splitString[2]);
        } else {
            System.out.println("Keni dhene daten ne formatin e gabuar!");
            System.out.println("Data duhet te jete: DD.MM.YYYY");
        }
    }


    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    //toString paraqet reprezentimin ne string te objektit ne fjale
    //se si duhet te shfaqet si tekst kur deshirojme te prezantojme
    @Override
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}






