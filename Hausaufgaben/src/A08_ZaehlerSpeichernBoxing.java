import java.util.ArrayList;
import java.util.Scanner;

public class A08_ZaehlerSpeichernBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> werte = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie 3 Werte ein: ");

        for (int i = 0; i < 3; i++) {
            werte.add(scanner.nextInt());
        }

        Integer wert1 = werte.get(0);

        int wert3 = werte.get(2);

        int summe = wert1 + wert3;
        System.out.println("Erster Wert plus letzter Wert: " + summe);

        scanner.close();
    }
}
