
import java.util.Arrays;
import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] zahlenanalyse = new int[5];
        int summe = 0;

        System.out.println("Bitte geben Sie 5 ganze Zahlen ein: ");

        for (int i = 0; i < 5; i++) {
            int eingabe = scanner.nextInt();
            zahlenanalyse[i] = eingabe;
            summe += zahlenanalyse[i];
        }

        int maximum = zahlenanalyse[0];
        int minimum = zahlenanalyse[0];

        for (int j = 0; j < 5; j++) {
            minimum = Math.min(minimum, zahlenanalyse[j]);
            maximum = Math.max(maximum, zahlenanalyse[j]);
        }

        double durchschnitt = (double) summe / zahlenanalyse.length;

        System.out.println(Arrays.toString(zahlenanalyse));
        System.out.println("Summe: " + summe);
        System.out.printf("Durchschnitt: %.2f%n", durchschnitt);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        scanner.close();
    }

}
