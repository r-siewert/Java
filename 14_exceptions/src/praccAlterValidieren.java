import java.util.Scanner;

public class praccAlterValidieren {

    public static void pruefeAlter(int alter) {
        if (alter < 0) {

            throw new IllegalArgumentException("Alter ungueltig");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bitte geben Sie ein Alter ein: ");
            int eingabe = scanner.nextInt();

            pruefeAlter(eingabe);

            System.out.println("Alter ist gueltig: " + eingabe);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
