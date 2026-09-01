import java.util.Scanner;

public class teamNameSuchen {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Text ein: ");
        String text = scanner.nextLine();

        System.out.println("Gefunden bei Index: " + text.toLowerCase().contains("team")); // true
        

        scanner.close();
    }
}
