import java.util.Scanner;

public class RabattPruefen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Einkaufswert;
        System.out.println("Bitte gib den Einkaufswert ein: ");
        Einkaufswert = scanner.nextDouble();

        if (Einkaufswert >= 50.0) {
            System.out.println("Rabatt ist möglich!");
        }
        scanner.close();
    }
}
