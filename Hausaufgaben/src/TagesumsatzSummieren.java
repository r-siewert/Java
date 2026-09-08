import java.util.Scanner;

public class TagesumsatzSummieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] kassenwerte = new double[2][3];

        System.out.println("Bitte Geben Sie 6 Kassenwerte ein: ");

        for (int i = 0; i < kassenwerte.length; i++) {

            for (int j = 0; j < kassenwerte[i].length; j++) {
                kassenwerte[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < kassenwerte.length; i++) {
            double summe = 0;
            for (int j = 0; j < kassenwerte[i].length; j++) {
                kassenwerte[i][j] = scanner.nextDouble();
                summe += kassenwerte[i][j];
            }

            System.out.println("Tagessumme: " + summe);
        }

        scanner.close();
    }
}
