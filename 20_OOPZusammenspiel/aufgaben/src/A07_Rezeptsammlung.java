import java.util.ArrayList;

class Rezept {
    String name;
    int minuten;

    public Rezept(String name, int minuten) {
        this.name = name;
        this.minuten = minuten;
    }
}

class Rezeptesammlung {
    private ArrayList<Rezept> rezepte;

    Rezeptesammlung() {
        rezepte = new ArrayList<>();
    }

    public void addRezept(Rezept rezept) {
        this.rezepte.add(rezept);
    }

    public int getAnzahl() {
        return this.rezepte.size();
    }

    public int getGesamtzeit() {
        int gesamtzeit = 0;
        for (Rezept rezept : this.rezepte) {
            gesamtzeit += rezept.minuten;
        }
        return gesamtzeit;
    }
}

public class A07_Rezeptsammlung {

    public static void main(String[] args) {
        Rezeptesammlung sammlung = new Rezeptesammlung();

        sammlung.addRezept(new Rezept("Suppe", 25));
        sammlung.addRezept(new Rezept("Brot", 40));

        System.out.println(sammlung.getAnzahl());
        System.out.println(sammlung.getGesamtzeit());
    }

}
