class Teilnahme {
    private final String nummer;

    Teilnahme(String nnummer) {
        this.nummer = nnummer;
    }

    public String getNummer() {
        return nummer;
    }

    // public void setNummer(String rnummer) { // durch das final ist unsere
    // instanzvariable ReadOnly und kann nicht durch
    // this.nummer = rnummer;
    // }
} // // den Setter verändert werden!

public class A08_ReadOnly {
    public static void main(String[] args) {
        Teilnahme teilnahme = new Teilnahme("T-17");

        // teilnahme.setNummer("X-12");
        System.out.println("Nummer: " + teilnahme.getNummer());

    }
}
