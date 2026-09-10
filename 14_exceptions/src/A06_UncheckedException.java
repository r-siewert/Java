public class A06_UncheckedException {

    public static void main(String[] args) {

        try {

            int zahl = Integer.parseInt("12"); // Buchstaben statt Zahlen provozieren den Fehler!
            // diese Zeile wird ausgeführt wenn die Umwandlung erfolgreich war!
            System.out.println("Zahl: " + zahl);

        } catch (NumberFormatException e) {
            System.out.println("Text ist keine Zahl!");
        }
    }

}
