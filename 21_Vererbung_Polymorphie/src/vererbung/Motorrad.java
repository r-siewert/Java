package vererbung;

public class Motorrad extends Fahrzeug {

    private int sitzAnzahl;

    public Motorrad(String marke, int sitzAnzahl) {
        super(marke);
        this.sitzAnzahl = sitzAnzahl;
    }

    private int getSitzAnzahl() {
        return sitzAnzahl;
    }

    // das nennt sich Polymorphie
    // Override, da public void starten, von Fahrzeug überschrieben wird.
    public void starten() {
        System.out.println("Das Motorrad der Marke: " + super.getMarke() + " hat " + getSitzAnzahl()
                + " Sitzplaetze und startet mit Kickstarter!");
    }

}
