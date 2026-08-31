import java.util.Scanner;

public class AufgabeGesamtpreisBerechnen01 {

    public static double berechneGesamtPreis(int anzahl, double preisProStueck) {
        return (double) (anzahl * preisProStueck);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl ein: ");
        int anzahl = scanner.nextInt();

        System.out.println("Bitte geben sie den Preis pro Stueck ein: ");
        double preisProStueck = scanner.nextDouble();

        double ergebnis = berechneGesamtPreis(anzahl, preisProStueck);

        System.out.println("Gesamt: " + ergebnis);

        scanner.close();
    }
}
