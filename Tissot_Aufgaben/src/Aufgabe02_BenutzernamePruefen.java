import java.util.Scanner;

public class Aufgabe02_BenutzernamePruefen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Benutzername: ");
        String benutzername = scanner.nextLine();

        System.out.println("Laenge: " + benutzername.length());

        scanner.close();
        
    }
    
}
