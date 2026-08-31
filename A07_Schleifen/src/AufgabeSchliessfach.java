import java.util.Scanner;

public class AufgabeSchliessfach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Fachnummer von 1 bis 10 ein: ");
        int fachnummer = scanner.nextInt();

        for (int i = 1; i <= fachnummer; i++) {
            System.out.println("Pruefung: " + i);
            if (i == fachnummer) {
                System.out.println("Schliessfach gefunden!");
            }
        }

        scanner.close();
    }

}
