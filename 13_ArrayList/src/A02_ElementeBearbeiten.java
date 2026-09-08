import java.util.ArrayList;

public class A02_ElementeBearbeiten {
    public static void main(String[] args) {
        ArrayList<String> aufgaben = new ArrayList<String>();

        aufgaben.add("lesen");
        aufgaben.add("Rechnen");
        aufgaben.add("Ueben");

        System.out.println(aufgaben); // [lesen, Rechnen, Ueben]

        // aendern des Wertes über den Index
        aufgaben.set(1, "Programmieren");

        System.out.println(aufgaben); // [lesen, Programmieren, Ueben]

        aufgaben.add("Debuggen"); // hinzufuegen von Debbungen

        System.out.println(aufgaben); // [lesen, Programmieren, Ueben, Debuggen]

        System.out.println("Anzahl: " + aufgaben.size()); // 4
    }
}
