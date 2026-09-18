import java.util.Scanner;

class Muenztresor {
    private int muenzen;

    public int setMuenzen(int mmuenzen) {

        this.muenzen = mmuenzen;
        return mmuenzen;
    }

    public int getMuenzen() {
        return muenzen;
    }

}

public class praccA01_Muenztresor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Muenztresor muenztresor = new Muenztresor();

        System.out.println("Bitte geben Sie eine Anzahn von Muenzen ein: ");
        int eingabe = scanner.nextInt();

        muenztresor.setMuenzen(eingabe);

        System.out.println("Tresorbestand: " + muenztresor.getMuenzen() + " Muenzen");

        scanner.close();
    }
}
