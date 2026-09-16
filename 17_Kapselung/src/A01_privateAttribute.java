class Konto {
    private int guthaben;

    // Methode
    void einzahlen(int betrag) {
        this.guthaben = betrag;
    }

    int getGuthaben() {
        return this.guthaben;
    }
}

public class A01_privateAttribute {
    public static void main(String[] args) {
        Konto konto = new Konto();
        konto.einzahlen(12);

        System.out.println(konto.getGuthaben());
    }
}
