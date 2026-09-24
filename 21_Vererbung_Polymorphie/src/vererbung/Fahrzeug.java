package vererbung;

public class Fahrzeug {
    private String marke;

    Fahrzeug(String marke) {
        this.marke = marke;

    }

    public String getMarke() {
        return marke;
    }

    public void starten() {
        System.out.println("Fahrzeug der Marke: " + marke + " startet!");
    }
}
