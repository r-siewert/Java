class Konstante18 {
    public static final double MWST_SATZ = 0.19;

    public static final int MAX_ANMELDUNGEN = 80;

    public static final String WAERUNG = "EUR";

}

public class A04_StaticKonstante {
    public static void main(String[] args) {

        double netto = 100.0;
        double brutto = netto * (1.0 * Konstante18.MWST_SATZ);

        System.out.println("Nettobetrag: " + netto + " " + Konstante18.WAERUNG);
        System.out.println("Nettobetrag: " + brutto + " " + Konstante18.WAERUNG);

        System.out.println("Max Anmeldungen: " + Konstante18.MAX_ANMELDUNGEN);

    }
}
