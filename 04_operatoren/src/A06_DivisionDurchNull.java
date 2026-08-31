public class A06_DivisionDurchNull {
    public static void main(String[] args) {

        int divisor = 0;

        try {
            int ergebnis = 10 / divisor;
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Ganzzahl division durch null ist nicht erlaubt!");
            System.out.println("Technische Fehlermeldung: " + e.getMessage());
        }

        System.out.println("Hallo Welt");

        // Merksatz: Ganzzahlen erzeugen bei einer Division durch 0 einen Fehler
        // Gleitkommazahlen dagegen Infinity
        double ergebnisDouble = 10.0 / divisor;
        System.out.println("Double-Division: " + ergebnisDouble);
        // Ergebnis NaN not a number
        double ergebnisDouble1 = 0.0 / divisor;
        System.out.println("Double-Division: " + ergebnisDouble1);

    }
}
