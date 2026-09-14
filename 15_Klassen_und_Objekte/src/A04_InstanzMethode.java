
class Zaehler {

    int wert; // InstanzVariable

    void erhoehen() { // InstanzMethode
        wert++;
    }

    int aktuellerWert() { // InstanzMethode
        return wert;
    }
}

public class A04_InstanzMethode {
    public static void main(String[] args) {
        Zaehler zaehler = new Zaehler();

        zaehler.erhoehen();
        zaehler.erhoehen();
        zaehler.erhoehen();
        zaehler.erhoehen();
        zaehler.erhoehen();

        System.out.println("Zaehler: " + zaehler.aktuellerWert());
    }
}
