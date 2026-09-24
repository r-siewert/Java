package vererbung;

public class Auto extends Fahrzeug {

    private int tueren;

    public Auto(String marke, int tueren) {
        super(marke);
        this.tueren = tueren;
    }

    public int getTueren() {
        return tueren;
    }

    public void starten() {
        System.out.println("Fahrzeug der Marke: " + super.getMarke() + " startet per Knopfdruck!");
    }

}
