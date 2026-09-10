import java.util.ArrayList;
import java.util.Scanner;

public class A03_WarteschlangeErweitern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> warteSchlange = new ArrayList<>();

        System.out.println("Bitte gib die Anzahl an Namen ein: ");
        int anzahlNamen = scanner.nextInt();

        System.out.println("Bitte gib genauso viele Namen, entsprechend der Anzahl ein: ");
        for (int i = 0; i < anzahlNamen; i++) {

            String name = scanner.next();
            warteSchlange.add(name);
        }

        System.out.println("Bitte gib einen neuen Namen ein: ");
        String neuerName = scanner.next();
        warteSchlange.add(neuerName);

        System.out.println("Die Neue Anzahl der Warteschlange beträngt: " + warteSchlange.size());

        int letzterName = warteSchlange.size() - 1;
        System.out.println("Letzer Name in der Warteschlange: " + warteSchlange.get(letzterName));

        scanner.close();
    }
}
