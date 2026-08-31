import java.util.Scanner;

public class AufgabeSpielProfil08 {

    public static String baueProfil(String spielerName, int level) {
        return "Spieler: " + spielerName + ", Level: " + level;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihren Namen ein: ");
        String name = scanner.nextLine();

        System.out.println("Bitte geben Sie das Level ein: ");
        int level = scanner.nextInt();

        String ergebnis = baueProfil(name, level);

        System.out.println(ergebnis);

        scanner.close();
    }

}
