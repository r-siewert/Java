import java.util.Scanner;

class Rabattaktion {

    private double rabatt = 0.0;

    public double getRabatt() {
        return this.rabatt;
    }

    public boolean setRabatt(double neuerRabatt) {
        if (neuerRabatt >= 0.0 && neuerRabatt <= 100.0) {
            this.rabatt = neuerRabatt;
            return true;
        }
        return false;
    }
}

public class A05_Rabattaktion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rabattaktion aktion = new Rabattaktion();

        System.out.print("Bitte den 1. Rabattwert eingeben: ");
        double wert1 = scanner.nextDouble();
        boolean erfolg1 = aktion.setRabatt(wert1);
        System.out.println("Wert 1 (" + wert1 + ") gesetzt: " + erfolg1);
        System.out.println();

        // 2. Wert abfragen
        System.out.print("Bitte den 2. Rabattwert eingeben: ");
        double wert2 = scanner.nextDouble();
        boolean erfolg2 = aktion.setRabatt(wert2);
        System.out.println("Wert 2 (" + wert2 + ") gesetzt: " + erfolg2);
        System.out.println();

        // Endergebnis anzeigen
        System.out.println("Endgültiger Rabattwert im Objekt: " + aktion.getRabatt());

        scanner.close();
    }
}
