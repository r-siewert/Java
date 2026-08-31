import java.util.Scanner;

public class AkkustandBewerten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int akkustand;
        System.out.println("Bitte geben sie den Akkustand ein:");
        akkustand = scanner.nextInt();
        if (akkustand >= 20) {
            System.out.println("Akkustand ausreichend");
        }
        if (akkustand < 20) {
            System.out.println("Bitta laden sie den Akku");
        }
        scanner.close();
    }

}
