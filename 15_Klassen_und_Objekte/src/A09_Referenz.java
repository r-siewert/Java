class Nachricht {
    String text;
}

public class A09_Referenz {
    public static void main(String[] args) {
        // es wurde bisher keine nachricht objekt erstellt
        Nachricht nachricht = null;

        // mit == null wird geprüft, ob nachricht momentan auf kein Objekt verweist!
        if (nachricht == null) {
            System.out.println("Keine Nachricht!");
        }

        // erstellen des nachrichten Objekts
        nachricht = new Nachricht();
        // standardwert von null auf "Hallo Welt! setzen"
        nachricht.text = "Hallo Welt!";

        System.out.println("Nachricht: " + nachricht.text);
    }
}
