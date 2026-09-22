import java.util.Scanner;

class Ueberladen {
    public static void lade(int w) {
        System.out.println("[Sensor-Int]: " + w);
    }

    public static void lade(double w) {
        System.out.println("[Sensor-Double]:" + w);
    }

    public static void lade(boolean w) {
        System.out.println("[Sensor-Boolean]: " + w);
    }
}

public class A05_MessDatenLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Int Wert ein: ");
        int i = scanner.nextInt();

        System.out.println("Bitte geben Sie einen Double Wert ein: ");
        double d = scanner.nextDouble();

        System.out.println("Bitte geben Sie einen Boolean Wert ein: ");
        boolean b = scanner.nextBoolean();

        Ueberladen.lade(i);
        Ueberladen.lade(d);
        Ueberladen.lade(b);

        scanner.close();

    }

}
