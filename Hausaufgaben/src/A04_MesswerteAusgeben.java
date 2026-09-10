import java.util.ArrayList;
import java.util.Scanner;

public class A04_MesswerteAusgeben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> messwerte = new ArrayList<>();

        System.out.println("Bitte gib 5 Messwerte ein: ");
        for (int i = 0; i < 5; i++) {
            int eingabe = scanner.nextInt();
            messwerte.add(eingabe);
        }

        for (int j = 0; j < messwerte.size(); j++) {
            System.out.println("Messwert: " + messwerte.get(j));
        }

        scanner.close();
    }

}
