public class A08_1_Versand {
    public static void main(String[] args) {

        final double VERSANDPAUSCHALE = 4.50;

        double warenwert = 12.00;

        double gesamtpreis = warenwert + VERSANDPAUSCHALE;

        System.out.println("Der Gesamtpreis beträgt: " + gesamtpreis + " Euro");
    }
}
