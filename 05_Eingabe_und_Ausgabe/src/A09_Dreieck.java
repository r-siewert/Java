import java.util.Scanner;

public class A09_Dreieck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double hoehe;
        System.out.println("Bitte gib die Höhe ein:");
        hoehe = scanner.nextDouble();

        double laenge;
        System.out.println("Bitte gib die länge der Grundseite ein:");
        laenge = scanner.nextDouble();

        System.out.println("Die Fläche beträgt: " + (hoehe * laenge / 2));
        scanner.close();
    }
}
