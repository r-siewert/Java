import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int geradecount = 0;
        int ungeradecount = 0;

        int[] zahlenliste = new int[10];

        System.out.println("Bitte geben Sie 10 ganze Zahlen ein: ");

        for (int i = 0; i < 10; i++) {
            int eingabe = scanner.nextInt();
            zahlenliste[i] = eingabe;

            if (zahlenliste[i] % 2 == 0) {
                geradecount += 1;
            } else {
                ungeradecount += 1;
            }

        }

        for (int j = 0; j < 10; j++) {
            if (zahlenliste[j] % 2 == 0) {
                System.out.println(zahlenliste[j] + " ist gerade");
            } else {
                System.out.println(zahlenliste[j] + " ist ungerade");
            }

        }

        System.out.println("Gerade Zahlen: " + geradecount);
        System.out.println("Ungerade Zahlen: " + ungeradecount);

        scanner.close();
    }
}
