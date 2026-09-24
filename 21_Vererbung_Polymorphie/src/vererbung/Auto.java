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

}
