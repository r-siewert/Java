import java.util.Scanner;

public class AufgabeVielfacheUeberspringen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Teiler ein: ");
        int teiler = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            if (i % teiler == 0) {
                continue;

            } else {
                System.out.println(i);
            }

        }

        scanner.close();
    }

}
