public class A01_JavaLang {
    public static void main(String[] args) {

        // String gehört zum Paket java.lang
        // deshalb ist kein import java.lang.String; erforderlich
        String text = "java";

        // Math gehört ebenfalls zu java.lang
        // Die statische Methode abs() liefert das ergebnis
        int wert = Math.abs(-9);

        // System gehört ebenfalls zu java.lang
        // über System.out.println() erfolgt die Ausgabe!
        System.out.println("text: " + text);
        System.out.println("Ergebnis: " + wert);

    }
}
