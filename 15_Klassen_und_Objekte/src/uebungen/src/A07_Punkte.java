package uebungen.src;

class Spielstand {
    int punkte;
}

public class A07_Punkte {

    public static void gutschrift(Spielstand stand, int wert) {
        stand.punkte = stand.punkte + wert;
    }

    public static void main(String[] args) {

        Spielstand spielstand = new Spielstand();

        spielstand.punkte = 10;

        gutschrift(spielstand, 6);

        System.out.println("Punkte: " + spielstand.punkte);
    }
}