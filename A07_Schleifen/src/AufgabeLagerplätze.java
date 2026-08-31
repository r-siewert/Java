import java.util.Scanner;

public class AufgabeLagerplätze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startplatz = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.println(startplatz -= 1);

        }

        scanner.close();
    }

}
