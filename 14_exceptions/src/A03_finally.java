public class A03_finally {
    public static void main(String[] args) {

        try {
            // versuche einen String in eine Zahl umzuwandeln
            int wert = Integer.parseInt("Fünf");
            System.out.println("wert: " + wert);

        } catch (NumberFormatException e) {
            System.out.println("Keine gültige zahl!");
        } finally {
            // irgendwelche aufräumarbeiten
            System.out.println("Aufräumen abgeschlossen!");
        }
    }
}
