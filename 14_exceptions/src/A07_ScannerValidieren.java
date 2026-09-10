import java.util.InputMismatchException;
import java.util.Scanner;

public class A07_ScannerValidieren {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("bitte Alter eingeben!");
            // bei ungültiger Eingabe, z.B. String, wird die Exception ausgelöst!

            int alter = scanner.nextInt();

            System.out.println("Alter: " + alter);

        } catch (InputMismatchException e) {
            System.out.println("Bitte eine Zahl eingeben!");
            scanner.close();
        } finally {
            scanner.close();
        }

    }

}

// ArithmeticException
// NullPointerException
// ArrayIndexOutOfBoundsExceptio
// NumberFormatException
