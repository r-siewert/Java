class Konzert {
    String titel;
    int jahr;

    Konzert() {
        titel = null;
        jahr = 0;
    }

    Konzert(String ptitel, int pjahr) {

        this.titel = ptitel;
        this.jahr = pjahr;

    }
}

public class praccA04_Konzert {
    public static void main(String[] args) {

        Konzert konzert1 = new Konzert();
        Konzert konzert2 = new Konzert("Sommerklang", 2026);

        System.out.println("Erstes: " + konzert1.titel + ", " + konzert1.jahr);
        System.out.println("Zweites: " + konzert2.titel + ", " + konzert2.jahr);
    }
}
