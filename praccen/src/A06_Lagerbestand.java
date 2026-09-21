import java.util.Scanner;

class Lagerbestand {

    private int bestand;

    public int getBestand() {
        return this.bestand;
    }

    public void setBestand(int neuerBestand) {

        if (neuerBestand >= 0) {
            this.bestand = neuerBestand;
        }

    }
}

public class A06_Lagerbestand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lagerbestand lager = new Lagerbestand();

        System.out.print("Bitte den 1. Bestand eingeben: ");
        int wert1 = scanner.nextInt();
        lager.setBestand(wert1);

        System.out.print("Bitte den 2. Bestand eingeben: ");
        int wert2 = scanner.nextInt();
        lager.setBestand(wert2);

        System.out.println("Lagerbestand: " + lager.getBestand() + " Stück");

        scanner.close();
    }
}