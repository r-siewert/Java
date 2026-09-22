import java.util.*;

public class A03_ImportAufgabe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Lea");

        System.out.println("Bitte geben seine eine ganze Zahl ein: ");
        int eingabe = scanner.nextInt();

        System.out.println("Teilnehmer: " + namen.get(0));

        System.out.println("Punkte: " + eingabe);

        scanner.close();
    }
}
