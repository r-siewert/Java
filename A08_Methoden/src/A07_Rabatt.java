public class A07_Rabatt {

    public static double preisMitRabatt(double betrag, double prozent) {
        double rabatt = (betrag * prozent) / 100;
        return betrag - rabatt;
    }

    public static void main(String[] args) {
        double endpreis = preisMitRabatt(345, 15);
        System.out.println("Preis mit Rabatt: " + endpreis);
    }
}
