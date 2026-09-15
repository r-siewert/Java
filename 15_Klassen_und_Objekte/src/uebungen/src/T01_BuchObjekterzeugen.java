package uebungen.src;

class Buch {
    String titel;
}

public class T01_BuchObjekterzeugen {
    public static void main(String[] args) {
        Buch buch = new Buch();

        buch.titel = "Java-Grundlagen";

        System.out.println("Titel: " + buch.titel);
    }
}
