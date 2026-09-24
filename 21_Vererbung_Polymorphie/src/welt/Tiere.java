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

    public void geraeuscheMachen() {
        System.out.println(getName() + "(Tier) macht ein geraeusch.");
    }
}
