import java.util.Scanner;

public class A03_Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.next();

        System.out.println("Alter:");
        int alter = sc.nextInt();

        System.out.println("Preis: ");
        double preis = sc.nextDouble();

        System.out.printf("Kunde: %s", name);
        System.out.printf("Alter: %d Jahre%n", alter);
        System.out.printf("Preis: %.2f Euro", preis);
        System.out.printf("Preis mit Mehrwertsteuer: %.2f Euro", preis * 1.19);
        sc.close();
    }
}
