import java.util.Scanner;


public class artikelNummerPruefen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Artikelnummer als positive, ganze Zahl ein: ");
        int numbers = scanner.nextInt();

         // valueOf() wandelt eine Zahl in einen String
        System.out.println("Zahl als Text: " + String.valueOf(44).length());



        scanner.close();
    }
    
}
