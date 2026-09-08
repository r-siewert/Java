import java.util.Scanner;

public class AufgabeRkursionImAnflug11 {

    public static void fahreNachOben(int aktuelleEtage, int zielEtage) {

        System.out.println("Etage: " + aktuelleEtage);
        if (zielEtage > aktuelleEtage) {
            fahreNachOben(aktuelleEtage + 1, zielEtage);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihre aktuelle Etage ein: ");
        int aktuelleEtage = scanner.nextInt();
        System.out.println("Bitte geben Sie ihre Zieletage ein: ");
        int zielEtage = scanner.nextInt();

        fahreNachOben(aktuelleEtage, zielEtage);

        System.out.println("Angekommen!");

        scanner.close();
    }

}
