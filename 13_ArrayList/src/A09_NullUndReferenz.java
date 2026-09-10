import java.util.ArrayList;

public class A09_NullUndReferenz {
    public static void main(String[] args) {
        ArrayList<String> notizen = new ArrayList<>();

        // Referenz auf ein String Objekt
        notizen.add("start");

        // keine Referenz auf ein String Objekt
        notizen.add(null);

        // contains(null) prüft, ob null in der ArrayList vorhanden ist.
        System.out.println("Null vorhanden: " + notizen.contains(null)); // true

        // Mit == null wird geprüft - auf 1 ist nichts drin und null ist nichts, also
        // wird nichts mit nichts geprüft und ergibt true!
        System.out.println("Zweiter Eintrag ist null: " + (notizen.get(1) == null));

        // equalsIgnoreCase() vergleicht auf Inhalt, ignoriert Groß- und
        // Kleinschreibung.
        System.out.println("Start vorhanden: " + notizen.get(0).equalsIgnoreCase("Start"));// true

        // notizen.get(1).equals(null);
        // wirft eine NullPointerException Auf null kann die Methode equals() nicht
        // aufgerufen werden
        // System.out.println(noitizen.get(1).equals(null));

    }
}
