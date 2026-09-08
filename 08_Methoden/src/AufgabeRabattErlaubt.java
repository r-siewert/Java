import java.util.Scanner;

public class AufgabeRabattErlaubt {

    public static boolean istRabattErlaubt(int einkommen, int grenze) {
        return einkommen >= grenze;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie das Einkommen ein: ");
        int einkommen = scanner.nextInt();
        System.out.println("Bitte geben sie die Grenze ein: ");
        int grenze = scanner.nextInt();

        boolean ergebnis = istRabattErlaubt(einkommen, grenze);

        System.out.println(einkommen + " >= " + grenze + ": " + ergebnis);

        scanner.close();
    }
}
