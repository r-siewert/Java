import java.util.ArrayList;
import java.util.Scanner;

public class A01_EinkaufslisteErzeugenArrayList {
    public static void main(String[] args) {
        ArrayList<String> einkaufsliste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Produkte für Ihre Einkaufsliste ein: ");

        for (int i = 0; i < 3; i++) {
            String eingabe = scanner.nextLine();
            einkaufsliste.add(eingabe);
        }

        System.out.println("Anzahl: " + einkaufsliste.size());
        System.out.println("Zweites Produkt: " + einkaufsliste.get(1));

        scanner.close();
    }
}
