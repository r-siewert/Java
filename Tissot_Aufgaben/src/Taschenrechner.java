import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double zahl1;
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        zahl1 = scanner.nextDouble();

        char operator;
        System.out.println("Bitte wählen Sie einen Operator aus: ('+', '-', '/', '*')");
        operator = scanner.next().charAt(0);

        double zahl2;
        System.out.println("Bitte geben sie eine weitere Zahl ein, mit der grechnet werden soll: ");
        zahl2 = scanner.nextDouble();

        double ergebnis = 0;
        boolean gueltigeOperation = true;

        switch (operator) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;

            case '-':
                ergebnis = zahl1 - zahl2;
                break;

            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                if (zahl2 == 0) {
                    System.out.println("Fehler: Division durch 0 ist nicht erlaubt!");
                    gueltigeOperation = false;
                } else {
                    ergebnis = zahl1 / zahl2;
                }
                break;
            default:
                System.out.println("Fehler: Ungültiger Operator verwendet!");
                gueltigeOperation = false;
                break;
        }
        if (gueltigeOperation) {
            System.out.println("Das Ergebnis ist: " + ergebnis);
        }
        scanner.close();
    }

}
