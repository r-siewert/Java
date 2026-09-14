class Karte {
    String farbe;
}

public class A06_ReferenzZuweisung {
    public static void main(String[] args) {
        Karte ersteReferenz = new Karte();

        ersteReferenz.farbe = "rot";

        Karte zweiteReferenz = ersteReferenz; // hier ist die Farbe noch rot

        zweiteReferenz.farbe = "blau";

        System.out.println("Erste Referenz: " + ersteReferenz.farbe); // beide Referenzen verweisen auf das gleiche
                                                                      // Objekt
        System.out.println("Zweite Referenz: " + zweiteReferenz.farbe); // beide Referenzen verweisen auf das gleiche
                                                                        // Objekt
        System.out.println("Gleiche Objekte: " + (ersteReferenz == zweiteReferenz));

        System.out.println("Vergleich inhalt: " + ersteReferenz.equals(zweiteReferenz)); // sowie der Inhalt

    }
}
