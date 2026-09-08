import java.util.ArrayList;

public class A06_Entfernen {
    public static void main(String[] args) {
        ArrayList<String> pakete = new ArrayList<String>();

        pakete.add("A");
        pakete.add("B");
        pakete.add("C");
        pakete.add("D");

        System.out.println(pakete); // [A, B, C, D]
        String rm = pakete.remove(1); // Löscht Paket B aus der Liste

        System.out.println("Pakete: " + pakete); // [A, C, D]
        System.out.println("Entferntes Paket: " + rm); // Entferntes Paket: B

        boolean gl = pakete.remove("C");

        System.out.println("Paket C gelöscht: " + gl + " Vorhandene Pakete: " + pakete);

        System.out.println("Element an Position 1: " + pakete.get(1));
    }
}
