import java.util.Scanner;

public class AufgabenHaltestellen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Haltestellennnummer ein: ");
        int haltestellennummer = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.println(haltestellennummer += 3);
        }

        scanner.close();

    }
}
