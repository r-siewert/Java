import java.util.Scanner;

public class Aufgabe05_PasswortPruefen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passwort;
        System.out.println("Bitte geben Sie das Passwort ein: ");
        passwort = scanner.nextLine();



        //boolean ergebnis = passwort.equals("Sicher123");

        System.out.println("Ergebnis: " + passwort.equals("Sicher123") );

    

        scanner.close();
    }
}
