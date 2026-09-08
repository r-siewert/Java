import java.util.Scanner;

public class AufgabeRechteckBerechnen03 {

    public static int flaeche(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie die laenge ein: ");
        int laenge = scanner.nextInt();
        System.out.println("Bitte geben sie die breite ein: ");
        int breite = scanner.nextInt();

        int ergebnis = flaeche(laenge, breite);

        System.out.println("Flaeche: " + ergebnis + " cm²");

        scanner.close();
    }
}
