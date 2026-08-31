import java.util.Scanner;

public class tissot_aufgaben2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Stueckzahl;
        System.out.println("Wie viel Stück:");

        while (!sc.hasNextInt()) {
            System.out.println("Das ist keine gültige Zahl!");
            sc.next();
            System.out.println("Bitte gib eine ganze Zahl ein!");
        }

        Stueckzahl = sc.nextInt();

        System.out.print("Artikel: " + Stueckzahl);
        System.out.print(" Stueck");
        System.out.println(" Erfasst");
        sc.close();
    }
}
