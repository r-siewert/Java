import java.util.Scanner;

public class codeMaske_ersetzen {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);



        System.out.println("Bitte geben Sie einen Text ein: ");
        String text = scanner.nextLine();
        
        

        System.out.println("Nach Zeichenersetzung: " + text.replace('u', '0'));


        System.out.println("Nach Textersetzung: " + text.replace("code", "block"));

        scanner.close();
    }
}