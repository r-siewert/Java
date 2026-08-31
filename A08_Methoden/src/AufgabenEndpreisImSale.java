import java.util.Scanner;

public class AufgabenEndpreisImSale {

    public static double preisNachRabatt(double preis, double prozent) {

        double rabatt = (preis * prozent) / 100;
        return preis - rabatt;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Preis ein: ");
        double preis = scanner.nextDouble();

        System.out.println("Bitte geben Sie den Prozensatz ein: ");
        double prozentsatz = scanner.nextDouble();

        double ergebnis = preisNachRabatt(preis, prozentsatz);

        System.out.println("Endpreis: " + ergebnis);

        scanner.close();
    }

}
