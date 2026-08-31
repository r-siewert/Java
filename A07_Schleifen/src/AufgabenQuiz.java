import java.util.Scanner;

public class AufgabenQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int von;
        System.out.println("Geben sie den wert für 'von' ein: ");
        von = scanner.nextInt();

        int bis;
        System.out.println("Geben Sie den Wert für 'bis' ein: ");
        bis = scanner.nextInt();

        int summe = 0;

        for (int i = von; i <= bis; i++) {
            summe += i;
        }
        System.out.println("Quizpunkte: " + summe);

        scanner.close();
    }

}
