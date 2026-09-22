import java.util.Scanner;

class Calculation {
    public static double steuerSatz1 = 0.07;
    public static final double steuerSatz2 = 0.19;
    public static final String WAEHRUNGSBEZEICHNUNG = "EUR";
}

public class A04_RechnungsKalkulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Nettobetrag ein: ");
        double eingabe = scanner.nextDouble();

        double brutto = eingabe * (1 + Calculation.steuerSatz2);
        double ermaessigt = eingabe * (1 + Calculation.steuerSatz1);

        System.out.println("Brutto regulaer: " + brutto + " " + Calculation.WAEHRUNGSBEZEICHNUNG);
        System.out.println("Brutto ermaessigt: " + ermaessigt + " " + Calculation.WAEHRUNGSBEZEICHNUNG);

        scanner.close();
    }
}
