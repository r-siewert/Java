import java.util.Scanner;

public class Versandkosten03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gewicht;
        System.out.println("Bitte geben sie das Gewicht ein:");
        gewicht = scanner.nextDouble();
        if (gewicht <= 1.0) {
            System.out.println("Versand: 3 Euro");
        } else {
            if (gewicht <= 5.0) {
                System.out.println("Versand: 6 Euro");
            } else {
                if (gewicht <= 10.0) {
                    System.out.println("Versand: 10 Euro");
                } else {
                    System.out.println("Versand: 15 Euro");
                }
            }
        }
        scanner.close();
    }
}
