class Passwort {
    private int laenge;

    Passwort(int llaenge) {
        if (llaenge < 8) {
            throw new IllegalArgumentException("Passwort zu kurz!");
        }
        this.laenge = llaenge;
    }

    public int getLaenge() {
        return laenge;
    }
}

public class A07_KonstruktorKapselung {
    public static void main(String[] args) {

        try {
            Passwort passwort = new Passwort(5);

            System.out.println("Laenge: " + passwort.getLaenge());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
