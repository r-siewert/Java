import java.util.Scanner;

public class LagerbestandA03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] lagerorte = {
                { 5, 9 },
                { 7, 11 }
        };

        System.out.println("Bitte geben Sie eine Zeile ein: ");
        int zeile = scanner.nextInt();

        System.out.println("Bitte geben Sie eine Spalte ein: ");
        int spalte = scanner.nextInt();

        System.out.println("Bitte geben Sie einen neuen Wert ein: ");
        int wert = scanner.nextInt();

        lagerorte[zeile][spalte] = wert;

        System.out.println("Neuer Bestand: " + lagerorte[zeile][spalte]);

        scanner.close();

    }
}
