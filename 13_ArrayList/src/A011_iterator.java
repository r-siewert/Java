import java.util.ArrayList;
import java.util.Iterator;

public class A011_iterator {
    public static void main(String[] args) {
        ArrayList<String> werte = new ArrayList<>();

        werte.add("bleibt");
        werte.add("entfernen");
        werte.add("was auch immer");
        werte.add("bliblablub");

        Iterator<String> iterator = werte.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("entfernen")) {
                iterator.remove();
            }
        }
        System.out.println(werte);// [bleibt, was auch immer, bliblablub]

        Iterator<String> zweiterIterator = werte.iterator();

        do {
            if (zweiterIterator.next().equals("bliblablub")) {
                zweiterIterator.remove();
            }

        } while (zweiterIterator.hasNext());

        System.out.println(werte);// [bleibt, was auch immer]

    }
}
