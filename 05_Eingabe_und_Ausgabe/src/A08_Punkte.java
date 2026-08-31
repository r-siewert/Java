import java.util.Scanner;

public class A08_Punkte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int punkte;
        System.out.println("Bitte gebe eine ganze Zahl ein:");
        punkte = scanner.nextInt();
        int bonus;
        System.out.println("Bitte gebe eine weitere, ganze Zahl ein:");

        bonus = scanner.nextInt();

        System.out.println("Gesamtpunkte: " + (punkte + bonus));
        scanner.close();
    }
}
