import java.util.ArrayList;
import java.util.Scanner;

public class A02_NoteErsetzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> noten = new ArrayList<>();

        System.out.println("Bitte gib eine Note ein: ");

        for (int i = 0; i < 4; i++) {
            int eingabe = scanner.nextInt();
            noten.add(eingabe);
        }

        System.out.println("Bitte gib einen Index ein: ");
        int index = scanner.nextInt();
        System.out.println("Bitte geben sie eine neue Note ein: ");
        int newgrade = scanner.nextInt();

        noten.set(index, newgrade);

        System.out.println("Die Neue Note lautet: " + noten.get(index));

        scanner.close();
    }
}
