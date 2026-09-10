import java.util.ArrayList;
import java.util.Scanner;

public class A07_PunkteMitMethodeSummieren {

    public static int berechneSumme(ArrayList<Integer> punkte) {
        int summe = 0;
        for (int i = 0; i < punkte.size(); i++) {
            summe += punkte.get(i);
        }
        return summe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> punkte = new ArrayList<>();

        System.out.println("Bitte geben Sie vier Punkte ein: ");

        for (int i = 0; i < 4; i++) {
            punkte.add(scanner.nextInt());
        }

        int summe = berechneSumme(punkte);
        System.out.println("Summe der Punktzahlen: " + summe);

        scanner.close();
    }

}
