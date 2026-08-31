public class A05_Konstanten {
    public static void main(String[] args) {

        final double MEHRWERTSTEUER = 0.19;

        double netto = 100;

        double brutto = netto + netto * MEHRWERTSTEUER;

        System.out.println("Netto: " + netto + " Euro");
        System.out.println("Brutto: " + brutto + " Euro");

        Integer zahl = 10;

        System.out.println(zahl.getClass().getSimpleName());

        if (zahl instanceof Integer) {
            System.err.println("Ich bin eine Ganzzahl! " + zahl);
        }

    }
}
