package uebungen.src;

import java.util.Scanner;

class Messgeraete {
    String name;
    double wert;
}

public class A05_Messgeraete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Messgeraete messgeraete1 = new Messgeraete();
        Messgeraete messgeraete2 = new Messgeraete();

        System.out.println("Bitte geben Sie einen Namen ein: ");
        String name1 = scanner.next();

        System.out.println("Bitte geben Sie einen Wert mit Komma ein: ");
        double wert1 = scanner.nextDouble();

        System.out.println("Bitte geben Sie einen zweiten Namen ein: ");
        String name2 = scanner.next();

        System.out.println("Bitte geben Sie einen zweiten Wert mit Komma ein: ");
        double wert2 = scanner.nextDouble();

        messgeraete1.name = name1;
        messgeraete2.name = name2;
        messgeraete1.wert = wert1;
        messgeraete2.wert = wert2;

        System.out.println(messgeraete1.name + ": " + messgeraete1.wert);
        System.out.println(messgeraete2.name + ": " + messgeraete2.wert);
    }
}
