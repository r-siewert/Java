import java.util.Scanner;

public class AufgabeAngebotformatieren02 {

    public static void zeigeAngebot(String produkt) {
        System.out.println("Angebot: " + produkt);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie einen Produktnamen ein: ");
        String produktname = scanner.nextLine();

        zeigeAngebot(produktname);

        scanner.close();
    }

}
