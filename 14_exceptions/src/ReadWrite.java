import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWrite {

    public static void main(String[] args) {

        try {
            Path datei = Path.of("notizen.txt");

            // Files.writeString(datei, "hallo stefan");
            System.out.println("Datei wurde angelegt!");

            String inhalt = Files.readString(datei);

            System.out.println("Inhalt der Datei: ");
            System.out.println(inhalt);

        } catch (IOException e) {
            System.out.println("Beim Dateizugriff ist ein Fehler aufgetreten!");
            System.out.println(e.getClass().getName());

            try {
                Path logdatei = Path.of("logdatei.txt");
                Files.writeString(logdatei, "konnte auf Datei nicht zugreifen");
            } catch (IOException ex) {
                System.out.println("Konnte in Logdatei nicht reinschreiben!");
            }
        }

    }
}
// nur über Terminal ausführbar, wenn kein absoluter pfad vorhanden ist