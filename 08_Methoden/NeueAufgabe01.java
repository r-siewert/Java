import java.util.Scanner;

public class NeueAufgabe01 {

public static double gesamtPreis(int anzahl, double einzelPreis) {
    return anzahl * einzelPreis;
    }

public static double gesamtPreis(int anzahl, double einzelPreis, double rabatt) {
    double gesamtPreisOhneRabatt = gesamtPreis(anzahl, einzelPreis);
    return gesamtPreisOhneRabatt - (gesamtPreisOhneRabatt * rabatt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl ein: ");
        int anzahl = scanner.nextInt();

        System.out.print("Geben Sie den Einzel-Preis ein: ");
        double einzelPreis = scanner.nextDouble();

        System.out.print("Geben Sie den Rabatt ein: ");
        double rabatt = scanner.nextDouble();

        double gesamtPreisOhneRabatt = gesamtPreis(anzahl, einzelPreis);
        double gesamtPreisMitRabatt = gesamtPreis(anzahl, einzelPreis, rabatt);

        System.out.println("Gesamtpreis ohne Rabatt: " + gesamtPreisOhneRabatt);
        System.out.println("Gesamtpreis mit Rabatt: " + gesamtPreisMitRabatt);

        scanner.close();
    }

}