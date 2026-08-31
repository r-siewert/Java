import java.util.Scanner;

public class A02_Eingabe_SichereZahl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();

        int alter;
        System.out.println("Wie alt bist du?");

        while (!scanner.hasNextInt()) {
            System.out.println("Das ist keine gültige Zahl!");
            scanner.next();
            System.out.println("Bitte gebe eine ganze Zahl ein!");
        }

        alter = scanner.nextInt();

        System.out.println("bist du sportlich? (true/false)");
        boolean sportlich = scanner.nextBoolean();

        int alterNaechstesJahr = alter + 1;

        System.out.println("Hallo " + name);

        System.out.println("Ich bin " + alter + " jahre alt!" + " und nächstes Jahr " + alterNaechstesJahr);
        System.out.println("Ich bin Sprotlich: " + sportlich);
        scanner.close();
    }

}
