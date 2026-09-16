class Gutschein {
    int wert;

    Gutschein(int wert) {
        if (wert < 5) {
            throw new IllegalArgumentException("Wert muss mindestens 5 Euro sein!");
        }

        this.wert = wert;
    }
}

public class A08_KonstruktorPruefen {
    public static void main(String[] args) {

        try {

            Gutschein gutschein = new Gutschein(4);

            System.out.println("Gutschein: " + gutschein.wert);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
