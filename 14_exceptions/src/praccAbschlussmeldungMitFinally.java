import java.util.Scanner;

public class praccAbschlussmeldungMitFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bitte gib einen text ein: ");
            String eingabe = scanner.nextLine();

            int zahl = Integer.parseInt(eingabe);

            System.out.println("Zahl akzeptiert!" + zahl);
        } catch (NumberFormatException e) {
            System.out.println("Keine Zahl.");
        }

        System.out.println("Pruefung beendet!");

        scanner.close();
    }
}
