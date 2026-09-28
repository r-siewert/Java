import java.util.Scanner;

public class A03_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben sie eine Zahl von 1-7 ein: ");

        int eingabe = scanner.nextInt();

        switch (eingabe) {
            case 1:
                System.out.println("Montag");
                break;

            case 2:
                System.out.println("Dienstag");
                break;

            case 3:
                System.out.println("Mittwoch");
                break;

            case 4:
                System.out.println("Donnerstag");
                break;

            case 5:
                System.out.println("Freitag");
                break;

            case 6, 7:
                System.out.println("Wochenende");
                break;

            default:
                System.out.println("Ungültiger Tag!");
                break;
        }

        scanner.close();
    }
}
