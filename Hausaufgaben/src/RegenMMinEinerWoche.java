import java.util.Scanner;

public class RegenMMinEinerWoche {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Bitte geben sie die Werte ein: ");
        // double wert1 = scanner.nextDouble();

        // double[] Regenmenge = {};
        double[] regenmenge = new double[4]; // nachdem ein Wert der Größe eines Arrays festgelegt wurde, ist es immutable und kann nicht mehr an der Größe verändert werden.

        for(int i = 0; i < regenmenge.length; i++ ){
            System.out.println("Regenmenge: ");
            regenmenge[i] = scanner.nextDouble();
        }

        System.out.println("Anzahl der Tage: " + regenmenge.length);
        System.out.println("Erster Wert: " + regenmenge[0]);
        System.out.println("Letzter Wert: " + regenmenge[regenmenge.length -1]);

    
        scanner.close();
    }
}