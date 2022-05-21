package cacttus.education.advanced_sort;

public class Borxhliu implements Comparable<Borxhliu> {
    private String name;
    private double vlera;

    public Borxhliu(String name, double vlera) {
        this.name = name;
        this.vlera = vlera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVlera() {
        return vlera;
    }

    public void setVlera(double vlera) {
        this.vlera = vlera;
    }

    @Override
    public int compareTo(Borxhliu o) {
        if (this.vlera < o.vlera) return -1;
        else if (this.vlera > o.vlera) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Borxhliu{" +
                "name='" + name + '\'' +
                ", vlera=" + vlera +
                '}';
    }
}
