import java.util.Scanner;

public class A09_Menue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int auswahl;

        do {

            System.out.println("Buecherei");
            System.out.println("1 - Buercherei");
            System.out.println("2 - Buch ausleihen");
            System.out.println("3 - Buch zurückgeben");
            System.out.println("0 - Programm beenden!");
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Buecher suchen !");
                    break;

                case 2:
                    System.out.println("Buch ausleihen !");
                    break;

                case 3:
                    System.out.println("Buch zurückgeben !");
                    break;

                case 0:
                    System.out.println("Programm wird beendet!");
                    break;

                default:
                    System.out.println("Ungültige Auswahl");
                    break;
            }

        } while (auswahl != 0);

        scanner.close();

    }

}
