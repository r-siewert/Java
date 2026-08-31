import java.util.Scanner;

public class Parkautomat05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parkzone;
        System.out.println("Bitte geben sie die Parkzone ein:");
        parkzone = scanner.nextInt();

        switch (parkzone) {
            case 1:
                System.out.println("Parkgebuehr: 1 Euro");
                break;

            case 2:
                System.out.println("Parkgebuehr: 2 Euro");
                break;

            case 3:
                System.out.println("Parkgebuehr: 4 Euro");
                break;

            case 4:
                System.out.println("Parkgebuehr: 6 Euro");
                break;

            default:
                System.out.println("ungueltige Zone!");
                break;
        }
        scanner.close();
    }

}
