
class Kursraum {
    String thema;
    int plaetze;

    Kursraum(String Pthema, int Pplaetze) {
        this.thema = Pthema;
        this.plaetze = Pplaetze;

    }
}

public class praccA03_Kursraum {
    public static void main(String[] args) {

        Kursraum kursraum = new Kursraum("Java", 18);

        System.out.println("Kursraum: " + kursraum.thema + ", " + kursraum.plaetze + " Plaetze");

    }
}
