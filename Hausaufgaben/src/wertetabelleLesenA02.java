import java.util.Scanner;

public class wertetabelleLesenA02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] werte = new double[2][3];

        System.out.println("Bitte geben sie 6 verschiedene Werte ein: ");

        for (int i = 0; i < werte.length; i++) {
            for (int j = 0; j < werte[i].length; j++) {
                werte[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Messwert: " + werte[0][1]);

        scanner.close();
    }
}
