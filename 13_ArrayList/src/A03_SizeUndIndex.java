import java.util.ArrayList;

public class A03_SizeUndIndex {
    public static void main(String[] args) {
        ArrayList<Integer> punkte = new ArrayList<Integer>();

        punkte.add(8);
        punkte.add(6);
        punkte.add(9);
        punkte.add(12);
        punkte.add(44);
        punkte.add(8);

        int letzterIndex = punkte.size() - 1;

        System.out.println("Größe: " + punkte.size());
        System.out.println("Letzter Wert: " + punkte.get(letzterIndex));

        System.out.println("Erster Wert: " + punkte.getFirst());
        System.out.println("Letzter Wert: " + punkte.getLast());
    }
}
