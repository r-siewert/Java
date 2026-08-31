import java.util.Scanner;


public class Aufgabe06_BenutzernameFormatieren {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);

        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();

        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();

        vorname = vorname.substring(0, 1).toUpperCase()
                + vorname.substring(1).toLowerCase();

        nachname = nachname.substring(0, 1).toUpperCase()
                + nachname.substring(1).toLowerCase();

        System.out.println(vorname + " " + nachname);

        scanner.close();
    }
    
}
