import java.util.ArrayList;

class Eintrittskarte {
    String ausstellung;
    double preis;

    public Eintrittskarte(String ausstellung, double preis) {
        this.ausstellung = ausstellung;
        this.preis = preis;
    }
}

class Museumsbesuch {

    private ArrayList<Eintrittskarte> karten;

    Museumsbesuch() {
        karten = new ArrayList<>();
    }

    public void addKarte(Eintrittskarte karte) {
        this.karten.add(karte);
    }

    public double getGesamtpreis() {
        double gesamtpreis = 0.0;
        for (Eintrittskarte karte : this.karten) {
            gesamtpreis += karte.preis;
        }
        return gesamtpreis;
    }
}

public class A03_Museumsbesuch {
    public static void main(String[] args) {
        Museumsbesuch besuch = new Museumsbesuch();

        besuch.addKarte(new Eintrittskarte("Roe", 12.50));
        besuch.addKarte(new Eintrittskarte("Farben", 8.00));

        System.out.println(besuch.getGesamtpreis());
    }
}