import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Temperatur ein: ");
        double eingabe = scanner.nextDouble();

        if (eingabe < 0) {
            System.out.println("Es ist frostig.");
        } else if (eingabe <= 15) {
            System.out.println("Es ist kalt.");
        } else if (eingabe <= 25) {
            System.out.println("Es ist angenehm.");
        } else if (eingabe <= 30) {
            System.out.println("Es ist warm.");
        } else if (eingabe <= 35) {
            System.out.println("Achtung, es ist sehr heiß!");
        } else {
            System.out.println("Achtung, es ist sehr heiß!");
            System.out.println("Hitzewarnung");
        }

        scanner.close();
    }
}
