package welt;

public class Insekten extends Lebewesen {

    private int fluegelAnzahl;

    public Insekten(String name, int fluegelAnzahl) {
        super(name);
        this.fluegelAnzahl = fluegelAnzahl;
    }

    public int getFluegelAnzahl() {
        return fluegelAnzahl;
    }

    @Override
    public void geraeuscheMachen() {
        System.out.println(getName() + "(insekt) macht geraeusch!");
    }
}
