
import java.util.Scanner;

public class sitzplanA01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] sitzbereich = new int[2][3];

        System.out.println("Bitte geben sie 6 Sitzplatznummern ein: ");

        for (int i = 0; i < sitzbereich.length; i++) {

            for (int j = 0; j < sitzbereich[i].length; j++) {
                sitzbereich[i][j] = scanner.nextInt();
            }
        }

        System.out.println(sitzbereich[1][2]);
        scanner.close();

    }
}
