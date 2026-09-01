import java.util.Scanner;

public class benutzernamenPruefen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Benutzernamen ein: ");
        String text = scanner.nextLine();

        if(text.isEmpty() == true){
            System.out.println("Der Benutzername darf nicht leer sein!");
        } else {
            System.out.println(text);
        }

        scanner.close();
    }
    
}
