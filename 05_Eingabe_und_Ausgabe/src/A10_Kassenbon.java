import java.util.Scanner;

public class A10_Kassenbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Artikelname;
        System.out.println("Wie lautet der Artikelname?:");
        Artikelname = scanner.nextLine();

        int Menge;
        System.out.println("Wie viel Stück?:");
        Menge = scanner.nextInt();

        double Einzelpreis;
        System.out.println("Wie lautet der Einzelpreis?:");
        Einzelpreis = scanner.nextDouble();

        System.out.println("Der Artikelname lautet: " + Artikelname);
        System.out.println("Der Stückmenge lautet: " + Menge + " Stueck");
        System.out.println("Der Einzelpreis lautet: " + Einzelpreis + " Euro");
        System.out.println("Der Gesamtpreis lautet: " + (Menge * Einzelpreis) + " Euro");
        scanner.close();
    }

}
