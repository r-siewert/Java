public class A01_TryCatch {
    public static void main(String[] args) {

        // try {

        // int divisor = 0;

        // int ergebnis = 12 / divisor;

        // System.out.println("Ergebnis: " + ergebnis);
        // } catch (ArithmeticException e) {
        // System.out.println("Division durch 0 erkannt");
        // System.out.println("Technische Fehlermeldung: " + e.getMessage());
        // }

        try { // allgemeine fehlermeldung

            int divisor = 0;

            int ergebnis = 12 / divisor;

            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Division durch 0 erkannt");
            System.out.println("Technische Fehlermeldung: " + e.getMessage());
        }

    }
}
