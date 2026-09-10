import java.util.ArrayList;

public class A07_ArrayListMethode {

    public static int summe(ArrayList<Integer> werte) {
        int ergebnis = 0;
        for (int index = 0; index < werte.size(); index++) {
            ergebnis += werte.get(index);
        }

        return ergebnis;
    }

    public static void main(String[] args) {
        ArrayList<Integer> werte = new ArrayList<>();
        werte.add(4);
        werte.add(7);
        werte.add(3);

        System.out.println("Summe: " + summe(werte));
    }
}
