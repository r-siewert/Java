class Zaehler {
    private int wert;

    public void erhoehen() {
        if (wert < 3) {
            wert++;
        }
    }

    public int getWert() {
        return wert;
    }
}

public class A09_MethodeAlsZugriff {
    public static void main(String[] args) {
        Zaehler zaehler = new Zaehler();

        zaehler.erhoehen(); // 1
        zaehler.erhoehen(); // 2
        zaehler.erhoehen(); // 3
        zaehler.erhoehen(); // 4

        System.out.println("Wert: " + zaehler.getWert());
    }
}
