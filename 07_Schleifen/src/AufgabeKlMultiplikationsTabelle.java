import java.util.Scanner;

public class AufgabeKlMultiplikationsTabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Startfaktor ein: ");
        int startfaktor = scanner.nextInt();

        System.out.println("Bitte geben Sie den Endfaktor ein: ");
        int endfaktor = scanner.nextInt();

        for (int a = startfaktor; a <= endfaktor; a++) {
            System.out.println("Einmaleins mit der " + a + ":");
            for (int b = 1; b <= 3; b++) {
                int ergebnis = a * b;
                System.out.println(b + " x " + a + " = " + ergebnis);
            }
            System.out.println();
        }
        scanner.close();
    }

}
