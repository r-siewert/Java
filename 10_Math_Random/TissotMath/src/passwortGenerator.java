import java.util.Scanner;
import java.util.Random;

public class passwortGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        System.out.println("Bitte geben Sie die Länge des Passworts ein: ");
        int zeichenlaenge = scanner.nextInt();


        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";


        StringBuilder passwort = new StringBuilder();
        Random zufall = new Random();

        for(int i = 0; i < zeichenlaenge; i++){
            int index = zufall.nextInt(pool.length());
            char zeichen = pool.charAt(index);
            passwort.append(zeichen);
        }
        
        System.out.println("Generiertes Passwort: " + passwort.toString());
        
        scanner.close();


    }
}
