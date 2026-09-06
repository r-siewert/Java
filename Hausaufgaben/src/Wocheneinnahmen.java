import java.util.Scanner;

public class Wocheneinnahmen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] wocheneinnahmen = new double[7];
        double summe = 0;

        System.out.println("Bitte geben Sie 7 Werte mit Kommazahlen ein: ");

        for(int i = 0; i < wocheneinnahmen.length; i++ ){
            double eingabe = scanner.nextDouble();

            wocheneinnahmen[i] = eingabe;
        
            summe += wocheneinnahmen[i];            
        }

        System.out.printf("Summe: %.2f%n", summe);
        double durchschnitt = (double) summe / wocheneinnahmen.length;    
        System.out.printf("Durchschnitt: %.2f%n", durchschnitt);     
    }
}



// % . 2 f
// │ │ │ └── floating-point number → Kommazahl
// │ │ └──── 2 Stellen
// │ └────── Genauigkeitsangabe
// └──────── „Hier kommt ein formatierter Wert“

// % n
// │ └────── Zeilenumbruch
// └──────── „Hier kommt ein formatierter Wert“