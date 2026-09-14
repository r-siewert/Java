import java.lang.reflect.Array;
import java.util.Scanner;

public class praccFehlerBeimArrayzugriffUnterscheiden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] zugriff = { 4, 8, 12 };

            System.out.println("Bitte geben Sie den Index ein, auf den Sie zugreifen wollen: ");
            int eingabe = scanner.nextInt();

            System.out.println(Array.get(zugriff, eingabe));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geht nur von 0 - 2!");
        }

        scanner.close();
    }

}
