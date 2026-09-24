package welt;

public class Tiere extends Lebewesen {

    private int beineAnzahl;

    Tiere(String name, int beineAnzahl) {
        super(name);
        this.beineAnzahl = beineAnzahl;
    }

    public int getBeineAnzahl() {
        return beineAnzahl;
    }
}
