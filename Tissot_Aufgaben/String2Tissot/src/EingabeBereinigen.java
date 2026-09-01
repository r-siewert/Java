import java.util.Scanner;

public class EingabeBereinigen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie einen Text ein: ");
        String text = scanner.nextLine();

        System.out.println("Bereinigt: " + text.trim());
        

        scanner.close();


        // Eingabe "   Max  "
    }
}
