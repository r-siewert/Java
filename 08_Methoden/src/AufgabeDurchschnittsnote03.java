import java.util.Scanner;

public class AufgabeDurchschnittsnote03 {

    public static double durchschnittsnote(double deutsch, double mathe, double informatik) {
        return (deutsch + mathe + informatik) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Note in Deutsch ein: ");
        double note1 = scanner.nextDouble();
        System.out.println("Bitte geben Sie Note in Mathe ein: ");
        double note2 = scanner.nextDouble();
        System.out.println("Bitte geben Sie Note in Informatik ein: ");
        double note3 = scanner.nextDouble();

        double ergebnis = durchschnittsnote(note1, note2, note3);

        System.out.println("Mittelwert: " + ergebnis);

        scanner.close();
    }
}
