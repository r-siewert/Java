import java.util.Scanner;

public class praccDivisionAbsichern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bitte geben sie die erste Zahl für eine Division ein: ");
            int eingabe1 = scanner.nextInt();

            System.out.println("Bitte geben sie die erste Zahl für eine Division ein: ");
            int eingabe2 = scanner.nextInt();

            System.out.println("Das Ergebnis ist: " + (eingabe1 / eingabe2));
        } catch (ArithmeticException e) {
            System.out.println("Teilen durch 0 ist nicht erlaubt!");
        }

        scanner.close();
    }

}
