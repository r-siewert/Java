import java.util.Scanner;

public class A01_certpracc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl ein: ");

        int eingabe = scanner.nextInt();

        String status = (eingabe % 2 == 0) ? "gerade" : "ungerade";

        System.out.println("Die eingegebene Zahl ist: " + eingabe + " und ist eine " + status + " Zahl!");

        scanner.close();
    }
}
