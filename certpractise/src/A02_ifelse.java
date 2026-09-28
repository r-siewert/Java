import java.util.Scanner;

public class A02_ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Punktzahl ein: ");

        int punkte = scanner.nextInt();

        if (punkte > 100 || punkte < 0) {
            System.out.println("ungültig");
        } else if (punkte <= 20) {
            System.out.println("ungenügend");
        } else if (punkte <= 50) {
            System.out.println("mangelhaft");
        } else if (punkte <= 60) {
            System.out.println("ausreichend");
        } else if (punkte <= 75) {
            System.out.println("befriedigend");
        } else if (punkte <= 90) {
            System.out.println("gut");
        } else {
            System.out.println("sehr gut");
        }

        scanner.close();
    }
}
