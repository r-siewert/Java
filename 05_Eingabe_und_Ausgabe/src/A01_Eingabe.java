import java.util.Scanner;

public class A01_Eingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();

        System.out.println("Wie alt bist du?");
        int alter = scanner.nextInt();

        System.out.println("bist du sportlich? (true/false)");
        boolean sportlich = scanner.nextBoolean();

        int alterNaechstesJahr = alter + 1;

        System.out.println("Hallo " + name);

        System.out.println("Ich bin " + alter + " jahre alt!" + " und nächstes Jahr " + alterNaechstesJahr);
        System.out.println("Ich bin Sprotlich: " + sportlich);
        scanner.close();
    }

}
