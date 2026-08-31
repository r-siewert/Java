import java.util.Scanner;

public class Fahrgeschaeft04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int koerpergroesse;
        System.out.println("Bitte geben Sie die Koerpergroeße ein:");
        koerpergroesse = scanner.nextInt();

        boolean erwachseneBegleitung;
        System.out.println("Haben Sie eine erwachsene Begleitung dabei? Bitte eingeben: (true/false)");
        erwachseneBegleitung = scanner.nextBoolean();

        if (koerpergroesse >= 140 && erwachseneBegleitung == true || koerpergroesse >= 150) {
            System.out.println("Die Fahrt ist erlaubt.");
        } else {
            System.out.println("Die Fahrt ist nicht erlaubt!");
        }
        scanner.close();
    }

}
