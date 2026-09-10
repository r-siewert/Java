import java.util.ArrayList;

public class A08_BoxingUndUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> zaehler = new ArrayList<>();

        // primitive variable vom datentyp int
        int startwert = 5;

        // Autoboxing primitiver int wert wird automatisch in ein Integer objekt
        // umgewandelt.
        zaehler.add(startwert);

        System.out.println(zaehler.get(0).equals(5));

        Integer gespeichert = zaehler.get(0);

        // Unboxing das Integerer-Objekt wird automatisch in einen primitiven int-Wert
        // umgewandelt.

        int wert = gespeichert;

        System.out.println(wert); // 5
    }
}
