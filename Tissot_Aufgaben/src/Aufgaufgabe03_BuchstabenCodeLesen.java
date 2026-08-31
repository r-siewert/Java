import java.util.Scanner;
public class Aufgaufgabe03_BuchstabenCodeLesen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib ein Wort ein: ");
        String wort = scanner.nextLine();

        char zeichen = wort.charAt(wort.length() - 2);

        System.out.println("Erstes Zeichen: " + zeichen);

        scanner.close();

        
    }
}