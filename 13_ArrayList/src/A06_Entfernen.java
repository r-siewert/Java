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

        ArrayList<Integer> nummern = new ArrayList<>();

        System.out.println("##############################################");

        nummern.add(4);
        nummern.add(1);
        nummern.add(7);
        nummern.add(8);
        nummern.add(9);

        nummern.remove(Integer.valueOf(7));
        // nummern.remove(nummern.lastIndexOf(7));
        // nummern.remove(nummern.get(3));

        System.out.println(nummern); // [4, 1, 8, 9]

        System.out.println("Wert 4 vorhanden: " + nummern.contains(4)); // true
        System.out.println("Wert 7 vorhanden: " + nummern.contains(7)); // false

        nummern.remove(1);

        System.out.println("Wert von 8 vorhanden: " + nummern.contains(8)); // true
        System.out.println(nummern); // [4, 8, 9]

        System.out.println("erster Eintrag: " + nummern.get(0)); // 4
        System.out.println("erster Eintrag: " + nummern.getFirst()); // 4
        System.out.println("letzter Eintrag: " + nummern.get(nummern.size() - 1)); // 9
        System.out.println("letzter Eintrag: " + nummern.getLast()); // 9
    }
}
