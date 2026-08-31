import java.util.Scanner;

public class AufgabenPaketeZaehlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startnummer;
        System.out.println("Bitte geben Sie Ihre Startnummer ein: ");
        startnummer = scanner.nextInt();

        int durchlauf = 0;

        while (durchlauf < 4) {

            System.out.println("Paket: " + startnummer);
            startnummer++;
            durchlauf++;

        }
        scanner.close();
    }

}
