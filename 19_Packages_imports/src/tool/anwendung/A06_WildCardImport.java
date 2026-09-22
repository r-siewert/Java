package tool.anwendung;

// der Wildcard.import stellt alle öffentlich zugängliche Klassen 
// und Interfaces aus dem Paket java.util. zur Verfügung
import java.util.*; // * -> Wildcard

public class A06_WildCardImport {
    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<>();
        HashSet<Integer> punkte = new HashSet<>();
        // Arraylist Items
        namen.add("Peter");
        namen.add("Pan");

        // Hashset Items -> keine Duplikate
        punkte.add(10);
        punkte.add(10);
        punkte.add(11);

        System.out.println("Name: " + namen.size());
        System.out.println("Punkte: " + namen.size());
    }
}
